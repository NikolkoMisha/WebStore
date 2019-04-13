package project.controller.admin; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import project.entity.Memory;
import project.service.MemoryService;

@Controller
@RequestMapping("/admin/type/memory")
@SessionAttributes("memory")
public class MemoryController {

	@Autowired
	private MemoryService memoryService;
	
	@ModelAttribute("memory")
	public Memory getform(){
		return new Memory();
	}
	
	@GetMapping
	public String show(Model model){
		model.addAttribute("memories", memoryService.findAll());
		return "admin-memory";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable Integer id, Model model){
		model.addAttribute("memory", memoryService.findOne(id));
		return show(model);
	}
	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		memoryService.delete(id);
		return "redirect:/admin/type/memory";
	}
	
	
	@PostMapping
	public String save(@ModelAttribute("memory") Memory entity, SessionStatus status){
		memoryService.save(entity);
		 status.setComplete();
		return "redirect:/admin/type/memory";
	}
}
