package project.controller.admin;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import project.dto.filter.TypeFilter;
import project.dto.form.TypeForm;
import project.editor.BatteryEditor;
import project.editor.CategoryEditor;
import project.editor.ColorEditor;
import project.editor.DiagonalEditor;
import project.editor.FrontCameraEditor;
import project.editor.MemoryEditor;
import project.editor.OSEditor;
import project.editor.OptionEditor;
import project.editor.ProcessorEditor;
import project.editor.RamEditor;
import project.editor.RearCameraEditor;
import project.editor.TypeEditor;
import project.editor.WeightEditor;
import project.entity.Battery;
import project.entity.Category;
import project.entity.Color;
import project.entity.Diagonal;
import project.entity.FrontCamera;
import project.entity.Memory;
import project.entity.OS;
import project.entity.Option;
import project.entity.Processor;
import project.entity.Ram;
import project.entity.RearCamera;
import project.entity.Weight;
import project.service.BatteryService;
import project.service.CategoryService;
import project.service.ColorService;
import project.service.DiagonalService;
import project.service.FrontCameraService;
import project.service.MemoryService;
import project.service.OSService;
import project.service.OptionService;
import project.service.ProcessorService;
import project.service.RamService;
import project.service.RearCameraService;
import project.service.TypeService;
import project.service.WeightService;
import project.validator.TypeValidator;

@Controller
@RequestMapping("/admin/type")
@SessionAttributes("model")
public class ModelController {


	@Autowired
	private TypeService typeService;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private MemoryService memoryService;
	@Autowired
	private ProcessorService processorService;
	@Autowired
	private ColorService colorService;
	@Autowired
	private DiagonalService diagonalService;
	@Autowired
	private WeightService weightService;
	@Autowired
	private OSService operating_systemService;
	@Autowired
	private BatteryService batteryService;
	@Autowired
	private OptionService kitService;
	@Autowired
	private RamService ramService;
	@Autowired
	private RearCameraService rear_cameraService;
	@Autowired
	private FrontCameraService front_cameraService;
	
	
	@ModelAttribute("model")
	public TypeForm getForm(){
		return new TypeForm();
	}
	
	@ModelAttribute("filter")
	public TypeFilter getFilter(){
		return new TypeFilter();
	}
	
	@InitBinder("model")
	protected void binder(WebDataBinder binder){
		binder.setValidator(new TypeValidator(typeService));
		binder.registerCustomEditor(project.entity.Model.class, new TypeEditor(typeService));
		binder.registerCustomEditor(Category.class, new CategoryEditor(categoryService));
		binder.registerCustomEditor(Memory.class, new MemoryEditor(memoryService));
		binder.registerCustomEditor(Processor.class, new ProcessorEditor(processorService));
		binder.registerCustomEditor(Color.class, new ColorEditor(colorService));
		binder.registerCustomEditor(Diagonal.class, new DiagonalEditor(diagonalService));
		binder.registerCustomEditor(Weight.class, new WeightEditor(weightService));
		binder.registerCustomEditor(OS.class, new OSEditor(operating_systemService));
		binder.registerCustomEditor(Battery.class, new BatteryEditor(batteryService));
		binder.registerCustomEditor(Option.class, new OptionEditor(kitService));
		binder.registerCustomEditor(Ram.class, new RamEditor(ramService));
		binder.registerCustomEditor(RearCamera.class, new RearCameraEditor(rear_cameraService));
		binder.registerCustomEditor(FrontCamera.class, new FrontCameraEditor(front_cameraService));
	}
	
	@GetMapping
	private String show(Model model, 
			@PageableDefault Pageable pageable, 
			@ModelAttribute("filter") TypeFilter filter){
		model.addAttribute("page", typeService.findAll(filter, pageable));
		model.addAttribute("categories", categoryService.findAll());
		model.addAttribute("colors", colorService.findAll());
		model.addAttribute("memories", memoryService.findAll());
		model.addAttribute("processors", processorService.findAll());
		model.addAttribute("diagonals", diagonalService.findAll());
		model.addAttribute("weights", weightService.findAll());
		model.addAttribute("batteries", batteryService.findAll());
		model.addAttribute("operating_systems", operating_systemService.findAll());
		model.addAttribute("kits", kitService.findAll());
		model.addAttribute("rams", ramService.findAll());
		model.addAttribute("rear_cameras", rear_cameraService.findAll());
		model.addAttribute("front_cameras", front_cameraService.findAll());
		
		return "admin-type";
		
	}
	
	@GetMapping("/update/{id}")
	private String update(@PathVariable int id,
			Model model,@PageableDefault Pageable pageable,
			@ModelAttribute("filter") TypeFilter filter){
		model.addAttribute("model", typeService.findForm(id));
		return show(model, pageable, filter);
	}
	
	
	@GetMapping("delete/{id}")
	private String delete(@PathVariable int id,
			@PageableDefault Pageable pageable,
			@ModelAttribute("filter") TypeFilter filter){
		typeService.delete(id);
		return "redirect:/admin/type" + getParams(pageable, filter);
	}
	
	
	@PostMapping
	public String save(@ModelAttribute("model")@Valid TypeForm form,
			BindingResult br,Model model ,SessionStatus status,
			@PageableDefault Pageable pageable,
			@ModelAttribute("filter") TypeFilter filter){
		if(br.hasErrors()) return show(model,pageable,filter);
		typeService.save(form);
		status.setComplete();
		return "redirect:/admin/type"+getParams(pageable, filter);
	}
	

	
	private String getParams(Pageable pageable, TypeFilter filter){
		StringBuilder buffer = new StringBuilder();
		buffer.append("?page=");
		buffer.append(String.valueOf(pageable.getPageNumber()+1));
		buffer.append("&size=");
		buffer.append(String.valueOf(pageable.getPageSize()));
		if(pageable.getSort()!=null){
			buffer.append("&sort=");
			Sort sort = pageable.getSort();
			sort.forEach((order)->{
				buffer.append(order.getProperty());
				if(order.getDirection()!=Direction.ASC)
				buffer.append(",desc");
			});
		}
		if(!filter.getMaxPrice().isEmpty()){
			buffer.append("&maxPrice=");
			buffer.append(filter.getMaxPrice());
		}
		if(!filter.getMinPrice().isEmpty()){
			buffer.append("&minPrice=");
			buffer.append(filter.getMinPrice());
		}
		for(Integer id : filter.getColorIds()){
			buffer.append("&colorId=");
			buffer.append(id);
		}
		for(Integer id : filter.getMemoryIds()){
			buffer.append("&memoryId=");
			buffer.append(id);
		}
		for(Integer id : filter.getCategoryIds()){
			buffer.append("&categoryId=");
			buffer.append(id);
		}
		for(Integer id : filter.getBatteryIds()){
			buffer.append("&batteryId=");
			buffer.append(id);
		}
		for(Integer id : filter.getDiagonalIds()){
			buffer.append("&diagonalId=");
			buffer.append(id);
		}
		for(Integer id : filter.getKitIds()){
			buffer.append("&kitId=");
			buffer.append(id);
		}
		for(Integer id : filter.getOperating_systemIds()){
			buffer.append("&operating_systemId=");
			buffer.append(id);
		}
		for(Integer id : filter.getProcessorIds()){
			buffer.append("&processorId=");
			buffer.append(id);
		}
		for(Integer id : filter.getWeightIds()){
			buffer.append("&weightId=");
			buffer.append(id);
		}
		for(Integer id : filter.getRamIds()){
			buffer.append("&ramId=");
			buffer.append(id);
		}
		for(Integer id : filter.getFront_cameraIds()){
			buffer.append("&front_cameraId=");
			buffer.append(id);
		}
		for(Integer id : filter.getRear_cameraIds()){
			buffer.append("&rear_cameraId=");
			buffer.append(id);
		}
		return buffer.toString();
	}
	

	
}
