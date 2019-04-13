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

import project.entity.Diagonal;
import project.service.DiagonalService;
import project.validator.DiagonalValidator;

@Controller
@RequestMapping("/admin/type/diagonal")
@SessionAttributes("diagonal")
public class DiagonalController {

	@Autowired
	private DiagonalService diagonalService;
	
	@InitBinder("diagonal")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new DiagonalValidator(diagonalService));
	}
	
	@ModelAttribute("diagonal")
	public Diagonal getform(){
		return new Diagonal();
	}
	
	@GetMapping
	public String show(Model model){
		model.addAttribute("diagonals", diagonalService.findAll());
		return "admin-diagonal";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable Integer id, Model model){
		model.addAttribute("diagonal", diagonalService.findOne(id));
		return show(model);
	}
	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		diagonalService.delete(id);
		return "redirect:/admin/type/diagonal";
	}
	
	
	@PostMapping
	public String save(@ModelAttribute("diagonal") @Valid Diagonal entity, BindingResult br,Model model ,SessionStatus status){
		if(br.hasErrors()) return show(model);
		diagonalService.save(entity);
		status.setComplete();
		return "redirect:/admin/type/diagonal";
	}
}

