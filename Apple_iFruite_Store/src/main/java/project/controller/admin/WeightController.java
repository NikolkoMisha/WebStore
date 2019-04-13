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

import project.entity.Weight;
import project.service.WeightService;
import project.validator.WeightValidator;

@Controller
@RequestMapping("/admin/type/weight")
@SessionAttributes("weight")
public class WeightController {

	@Autowired
	private WeightService weightService;
	
	@InitBinder("weight")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new WeightValidator(weightService));
	}
	
	@ModelAttribute("weight")
	public Weight getform(){
		return new Weight();
	}
	
	@GetMapping
	public String show(Model model){
		model.addAttribute("weights", weightService.findAll());
		return "admin-weight";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable Integer id, Model model){
		model.addAttribute("weight", weightService.findOne(id));
		return show(model);
	}
	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		weightService.delete(id);
		return "redirect:/admin/type/weight";
	}
	
	
	@PostMapping
	public String save(@ModelAttribute("weight") @Valid Weight entity, BindingResult br,Model model ,SessionStatus status){
		if(br.hasErrors()) return show(model);
		weightService.save(entity);
		status.setComplete();
		return "redirect:/admin/type/weight";
	}
}

