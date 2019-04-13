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

import project.entity.OS;
import project.service.OSService;
import project.validator.OSValidator;



@Controller
@RequestMapping("/admin/type/operating_system")
@SessionAttributes("operating_system")
public class OSController {

	@Autowired
	private OSService operating_systemService;
	
	@InitBinder("operating_system")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new OSValidator(operating_systemService));
	}
	
	@ModelAttribute("operating_system")
	public OS getform(){
		return new OS();
	}
	
	@GetMapping
	public String show(Model model){
		model.addAttribute("operating_systems", operating_systemService.findAll());
		return "admin-operating_system";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable Integer id, Model model){
		model.addAttribute("os", operating_systemService.findOne(id));
		return show(model);
	}
	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		operating_systemService.delete(id);
		return "redirect:/admin/type/operating_system";
	}
	
	
	@PostMapping
	public String save(@ModelAttribute("operating_system") @Valid OS entity, BindingResult br,Model model ,SessionStatus status){
		if(br.hasErrors()) return show(model);
		operating_systemService.save(entity);
		status.setComplete();
		return "redirect:/admin/type/operating_system";
	}
}
