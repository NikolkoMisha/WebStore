package project.controller.admin;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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

import project.dto.filter.SimpleFilter;
import project.dto.form.CommodityForm;
import project.service.CommodityService;
import project.validator.CommodityValidator;
import static project.util.ParamBuilder.*;

@Controller
@RequestMapping("/admin/commodity")
@SessionAttributes("commodity")
public class CommodityController {
	
	@Autowired
	private CommodityService commodityService;
	
	@InitBinder("commodity")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new CommodityValidator(commodityService));
	}
	
	@ModelAttribute("commodity")
	public CommodityForm getForm(){
		return new CommodityForm();
	}
	
	@ModelAttribute("filter")
	public SimpleFilter getFilter(){
		return new SimpleFilter();
	}
	
	@GetMapping
	public String show(Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") SimpleFilter filter){
		model.addAttribute("page", commodityService.findAll(pageable, filter));
		return "admin-commodity";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable Integer id, Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") SimpleFilter filter){
		model.addAttribute("commodity", commodityService.findOne(id));
		return show(model, pageable, filter);
	}
	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id,  @PageableDefault Pageable pageable, @ModelAttribute("filter") SimpleFilter filter){
		commodityService.delete(id);
		return "redirect:/admin/commodity"+getParams(pageable, filter);
	}
	
	
	

	@PostMapping
	public String save(@ModelAttribute("commodity") 
			@Valid CommodityForm form, BindingResult br,Model model ,SessionStatus status,
			@PageableDefault Pageable pageable, 
			@ModelAttribute("filter") SimpleFilter filter){
		if(br.hasErrors()) return show(model, pageable, filter);
		commodityService.save(form);
		status.setComplete();
		return "redirect:/admin/commodity"+getParams(pageable, filter);
	}
}
