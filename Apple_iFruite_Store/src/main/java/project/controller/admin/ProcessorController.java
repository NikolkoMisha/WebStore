package project.controller.admin;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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

import project.entity.Processor;
import project.service.ProcessorService;
import project.validator.ProcessorValidator;

@Controller
@RequestMapping("/admin/type/processor")
@SessionAttributes("processor")
public class ProcessorController {

	@Autowired
	private ProcessorService processorService;
	
	@InitBinder("processor")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new ProcessorValidator(processorService));
	}
	
	@ModelAttribute("processor")
	public Processor getform(){
		return new Processor();
	}
	
	@GetMapping
	public String show(Model model){
		model.addAttribute("processors", processorService.findAll());
		return "admin-processor";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable Integer id, Model model){
		model.addAttribute("processor", processorService.findOne(id));
		return show(model);
	}
	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		processorService.delete(id);
		return "redirect:/admin/type/processor";
	}
	
	
	@PostMapping
	public String save(@ModelAttribute("processor") @Valid Processor entity, BindingResult br,Model model ,SessionStatus status){
		if(br.hasErrors()) return show(model);
		processorService.save(entity);
		status.setComplete();
		return "redirect:/admin/type/processor";
	}
}