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

import project.entity.FrontCamera;
import project.service.FrontCameraService;
import project.validator.FrontCameraValidator;

@Controller
@RequestMapping("admin/type/front_camera")
@SessionAttributes("frontcamera")
public class FrontCameraController {

	@Autowired
	private FrontCameraService front_cameraService;
	
	@InitBinder("frontcamera")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new FrontCameraValidator(front_cameraService));
	}
	
	@ModelAttribute("frontcamera")
	public FrontCamera getForm(){
		return new FrontCamera();
	}
	
	@GetMapping
	public String show(Model model){
		model.addAttribute("frontcameras", front_cameraService.findAll());
		return "admin-front_camera";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable Integer id, Model model){
		model.addAttribute("frontcamera", front_cameraService.findOne(id));
		return show(model);
	}
	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		front_cameraService.delete(id);
		return "redirect:/admin/type/front_camera";
	}
	
	
	@PostMapping
	public String save(@ModelAttribute("frontcamera") @Valid FrontCamera entity, BindingResult br,Model model ,SessionStatus status){
		if(br.hasErrors()) return show(model);
		front_cameraService.save(entity);
		status.setComplete();
		return "redirect:/admin/type/front_camera";
	}
}
