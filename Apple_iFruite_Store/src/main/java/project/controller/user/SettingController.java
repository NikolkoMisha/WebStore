package project.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import project.dto.form.SettingForm;
import project.editor.SettingEditor;
import project.editor.TypeEditor;
import project.entity.Setting;
import project.service.SettingService;
import project.service.TypeService;

@Controller
@RequestMapping("/model/setting")
@SessionAttributes("setting")
public class SettingController {
	
	@Autowired
	private SettingService settingService;
	@Autowired
	private TypeService typeService;
	
	
//	@ModelAttribute("setting")
//	public SettingForm getForm(){
//		return new SettingForm();
//	}
//	
//	@InitBinder("setting")
//	protected void bind(WebDataBinder binder){
//		binder.setValidator(new SettingValidator(settingService));
//		binder.registerCustomEditor(Setting.class, new SettingEditor(settingService));
//		binder.registerCustomEditor(project.entity.Model.class, new TypeEditor(typeService));
//	}
//	
//	@GetMapping("/model/setting/{id}")
//	public String setting(@PathVariable int id,Model model){
//		model.addAttribute("settings", settingService.findAll());
//		model.addAttribute("models", typeService.findAll());
//		model.addAttribute("type" ,typeService.findForm(id));
//		model.addAttribute("setting", new Setting());
//		return "redirect:/model/setting";
//	}
//	
//	@PostMapping("/model/setting")
//	public String setting(@ModelAttribute("setting")  SettingForm form , BindingResult br ,Model model,SessionStatus status){
//		settingService.save(form);
//		status.setComplete();
//		return "redirect:/bought";
//	}
//	
//	@GetMapping("/bought")
//	public String bought(){
//		return "user-bought";
//	}
//	
//	@GetMapping("/model/setting/{id}")
//	public String setting(@PathVariable int id,Model model){
//		model.addAttribute("typies", typeService.findAll());
//		model.addAttribute("type" ,typeService.findForm(id));
//		model.addAttribute("setting", new Setting());
//		return "user-setting";
//	}
//	
//	@PostMapping("/model/setting")
//	public String setting(@ModelAttribute("setting")  SettingForm form ,Model model){
//		  
//		settingService.save(form);
//		return "";
//	}
//
//	@PostMapping
//	public String save(@ModelAttribute("setting") SettingForm form, Model model, SessionStatus status){
//		settingService.save(form);
//		status.setComplete();
//		return "redirect:/bought";
//	}
//	
//	@GetMapping("/bought")
//	public String bought(){
//		return "user-bought";
//	}
//	

	
}
