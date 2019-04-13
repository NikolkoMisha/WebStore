package project.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import project.repository.UserRepository;

@Controller
@RequestMapping("/admin/law/user_delete")
public class User_DeleteController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public String show(Model model){
		model.addAttribute("users", userRepository.findAll());
		return "admin-user_delete";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		userRepository.delete(id);
		return "redirect:/admin/law/user_delete";
	}
	
}
