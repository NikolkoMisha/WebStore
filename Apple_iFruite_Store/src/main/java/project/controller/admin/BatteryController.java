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

import project.entity.Battery;
import project.service.BatteryService;
import project.validator.BatteryValidator;

@Controller
@RequestMapping("/admin/type/battery")
@SessionAttributes("battery")
public class BatteryController {

	@Autowired
	private BatteryService batteryService;
	
	@InitBinder("battery")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new BatteryValidator(batteryService));
	}
	
	@ModelAttribute("battery")
	public Battery getForm(){
		return new Battery();
	}
	
	@GetMapping
	public String show(Model model){
		model.addAttribute("batteries", batteryService.findAll());
		return "admin-battery";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable Integer id, Model model){
		model.addAttribute("battery", batteryService.findOne(id));
		return show(model);
	}
	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		batteryService.delete(id);
		return "redirect:/admin/type/battery";
	}
	
	
	@PostMapping
	public String save(@ModelAttribute("battery") @Valid Battery entity, BindingResult br,Model model ,SessionStatus status){
		if(br.hasErrors()) return show(model);
		batteryService.save(entity);
		status.setComplete();
		return "redirect:/admin/type/battery";
	}
}

