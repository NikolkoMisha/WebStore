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

import project.dto.filter.CategoryFilter;
import project.dto.form.CategoryForm;
import project.editor.CommodityEditor;
import project.entity.Commodity;
import project.service.CategoryService;
import project.service.CommodityService;
import project.util.ParamBuilder;
import project.validator.CategoryValidator;

@Controller
@RequestMapping("/admin/category")
@SessionAttributes(names="category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	@Autowired
	private CommodityService commodityService;
	
	@InitBinder("category")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new CategoryValidator(categoryService));
		binder.registerCustomEditor(Commodity.class, new CommodityEditor(commodityService));
	}
	
	@ModelAttribute("category")
	public CategoryForm getForm(){
		return new CategoryForm();
	}
		
	@ModelAttribute("filter")
	public CategoryFilter getFilter(){
		return new CategoryFilter();
	}
		
	
	@GetMapping
	public String show(Model model, 
			@PageableDefault Pageable pageable,
			@ModelAttribute("filter") CategoryFilter filter){
		model.addAttribute("page", categoryService.findAll(filter, pageable));
		model.addAttribute("commodities", commodityService.findAll());
		return "admin-category";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Model model,
			@PageableDefault Pageable pageable, 
			@ModelAttribute("filter") CategoryFilter filter ){
		model.addAttribute("category", categoryService.findForm(id));
		return show(model, pageable, filter);
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id,
			@PageableDefault Pageable pageable, 
			@ModelAttribute("filter") CategoryFilter filter){
		categoryService.delete(id);
		return "redirect:/admin/category"+getParams(filter, pageable);
	}
	
	
	@PostMapping
	public String save(@ModelAttribute("category")@Valid CategoryForm category,
			BindingResult br,Model model ,SessionStatus status,
			@PageableDefault Pageable pageable,
			@ModelAttribute("filter") CategoryFilter filter){
		if(br.hasErrors()) return show(model,pageable,filter);
		categoryService.save(category);
		status.setComplete();
		return "redirect:/admin/category"+getParams(filter, pageable);
	}
	
	private String getParams(CategoryFilter filter,Pageable pageable){
		String page = ParamBuilder.getParams(pageable);
		StringBuilder builder = new StringBuilder(page);
		if(!filter.getCommodityIds().isEmpty()){
			for(Integer id : filter.getCommodityIds()){
				builder.append("&commodityIds");
				builder.append(id);
			}
		}
		return builder.toString();
	}
	
}





