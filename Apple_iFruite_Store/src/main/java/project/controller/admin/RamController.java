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

import project.entity.Ram;
import project.service.RamService;
import project.validator.RamValidator;

@Controller
@RequestMapping("admin/type/ram")
@SessionAttributes("ram")
public class RamController {

	@Autowired
	private RamService ramService;
	
	@InitBinder("ram")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new RamValidator(ramService));
	}
	
	@ModelAttribute("ram")
	public Ram getForm(){
		return new Ram();
	}
	
	@GetMapping
	public String show(Model model){
		model.addAttribute("rams", ramService.findAll());
		return "admin-ram";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable Integer id, Model model){
		model.addAttribute("ram", ramService.findOne(id));
		return show(model);
	}
	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		ramService.delete(id);
		return "redirect:/admin/type/ram";
	}
	
	
	@PostMapping
	public String save(@ModelAttribute("ram") @Valid Ram entity, BindingResult br,Model model ,SessionStatus status){
		if(br.hasErrors()) return show(model);
		ramService.save(entity);
		status.setComplete();
		return "redirect:/admin/type/ram";
	}
}
