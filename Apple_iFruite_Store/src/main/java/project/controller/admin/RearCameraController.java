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

import project.entity.RearCamera;
import project.service.RearCameraService;
import project.validator.RearCameraValidator;

@Controller
@RequestMapping("admin/type/rear_camera")
@SessionAttributes("rearcamera")
public class RearCameraController {

	@Autowired
	private RearCameraService rear_cameraService;
	
	@InitBinder("rearcamera")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new RearCameraValidator(rear_cameraService));
	}
	
	@ModelAttribute("rearcamera")
	public RearCamera getForm(){
		return new RearCamera();
	}
	
	@GetMapping
	public String show(Model model){
		model.addAttribute("rearcameras", rear_cameraService.findAll());
		return "admin-rear_camera";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable Integer id, Model model){
		model.addAttribute("rearcamera", rear_cameraService.findOne(id));
		return show(model);
	}
	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		rear_cameraService.delete(id);
		return "redirect:/admin/type/rear_camera";
	}
	
	
	@PostMapping
	public String save(@ModelAttribute("rearcamera") @Valid RearCamera entity, BindingResult br,Model model ,SessionStatus status){
		if(br.hasErrors()) return show(model);
		rear_cameraService.save(entity);
		status.setComplete();
		return "redirect:/admin/type/rear_camera";
	}
	
}
