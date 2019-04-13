package project.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {


	@RequestMapping("/admin/law")
	public String law(){
		return "admin-law";
	}
}