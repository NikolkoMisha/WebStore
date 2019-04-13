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

import project.entity.Option;
import project.service.OptionService;
import project.validator.OptionValidator;

@Controller
@RequestMapping("/admin/type/option")
@SessionAttributes("kit")
public class OptionController {

	@Autowired
	private OptionService kitService;
	
	@InitBinder("kit")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new OptionValidator(kitService));
	}
	
	@ModelAttribute("kit")
	public Option getform(){
		return new Option();
	}
	
	@GetMapping
	public String show(Model model){
		model.addAttribute("kits", kitService.findAll());
		return "admin-option";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable Integer id, Model model){
		model.addAttribute("kit", kitService.findOne(id));
		return show(model);
	}
	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		kitService.delete(id);
		return "redirect:/admin/type/option";
	}
	
	
	@PostMapping
	public String save(@ModelAttribute("kit") @Valid Option entity, BindingResult br,Model model ,SessionStatus status){
		if(br.hasErrors()) return show(model);
		kitService.save(entity);
		status.setComplete();
		return "redirect:/admin/type/option";
	}
}
