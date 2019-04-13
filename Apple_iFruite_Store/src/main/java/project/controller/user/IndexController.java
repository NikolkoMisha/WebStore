package project.controller.user;


import java.math.BigDecimal;
import java.security.Principal;
import java.util.HashMap;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import project.dto.filter.TypeFilter;
import project.dto.form.SettingForm;
import project.dto.form.TypeForm;
import project.editor.ColorEditor;
import project.editor.MemoryEditor;
import project.editor.SettingEditor;
import project.editor.TypeEditor;
import project.entity.*;
import project.service.CategoryService;
import project.service.ColorService;
import project.service.CommodityService;
import project.service.MemoryService;
import project.service.SettingService;
import project.service.TypeService;
import project.service.UserService;
import project.validator.UserValidator;

@Controller
public class IndexController {
	
	
		@Autowired
		private TypeService typeService;
		@Autowired
		private ColorService colorService;
		@Autowired
		private MemoryService memoryService;
		@Autowired
		private CategoryService categoryService;
		@Autowired
		private CommodityService commodityService;
		@Autowired
		private UserService userService;
		@Autowired
		private SettingService settingService;
		
		
		@ModelAttribute("type")
		public TypeForm getForm(){
			return new TypeForm();
		}
		
		@ModelAttribute("filter")
		public TypeFilter getFilter(){
			return new TypeFilter();
		}
		
		@ModelAttribute("cart")
		public ShopingCart getform(){
			return new ShopingCart();
		}
		
		@ModelAttribute("comapre")
		public Compare getform1(){
			return new Compare();
		}
		
		@InitBinder("user")
		protected void bind(WebDataBinder binder){
			binder.setValidator(new UserValidator(userService));
		}
		
		@InitBinder("model")
		protected void binder(WebDataBinder binder){
			binder.registerCustomEditor(project.entity.Model.class,new TypeEditor(typeService));
			binder.registerCustomEditor(Color.class, new ColorEditor(colorService));
			binder.registerCustomEditor(Memory.class, new MemoryEditor(memoryService));
		}
		
		@InitBinder("setting")
		protected void br(WebDataBinder binder){
			binder.registerCustomEditor(Setting.class, new SettingEditor(settingService));
			binder.registerCustomEditor(project.entity.Model.class,new TypeEditor(typeService));
			binder.registerCustomEditor(Color.class, new ColorEditor(colorService));
			binder.registerCustomEditor(Memory.class, new MemoryEditor(memoryService));
		}
		
	
		
		
		@RequestMapping("/")
		public String indexShow(Model model,@CookieValue(defaultValue="0", name="userId") int id, HttpServletResponse response,@PageableDefault Pageable pageable, @ModelAttribute("filter") TypeFilter filter,Principal principal){
			if(id==0){
			id = userService.createNewUser();
				response.addCookie(new Cookie("userId", String.valueOf(id)));
			}
			
			model.addAttribute("page", typeService.findAll(filter, pageable));
			model.addAttribute("categories", categoryService.findAll());
			model.addAttribute("commodities", commodityService.findAll());
			model.addAttribute("colors", colorService.findAll());
			model.addAttribute("memories", memoryService.findAll());
			if(principal!=null){
				System.out.println(principal.getName());
				
			}
			System.out.println(typeService.findAll(filter, pageable).hashCode());
//			System.out.println(typeService.);
			System.out.println( typeService.findAll(filter, pageable).getContent().toString());
			return "user-index";
		}
		
		@RequestMapping("/commodity/{commodityId}")
		public String commodityShow(Model model, @CookieValue(defaultValue="0", name="userId") int id, HttpServletResponse response,@PathVariable @ModelAttribute("category") Integer commodityId){
			model.addAttribute("categories", categoryService.findByCommodityId(commodityId));
			model.addAttribute("commodity", commodityService.findOne(commodityId));
			return "user-commodity";
		}
		
		@RequestMapping("/category/{categoryId}")
		public String categoryShow(Model model, @CookieValue(defaultValue="0", name="userId") int id, HttpServletResponse response,@PageableDefault Pageable pageable ,@ModelAttribute("filter") TypeFilter filter,Principal principal, @PathVariable @ModelAttribute("model")Integer categoryId){
	//		model.addAttribute("commodity", commodityService.findOne(categoryService.findOne(categoryId).getCommodity().getId()));
			
			model.addAttribute("category", categoryService.findOne(categoryId));
//			model.addAttribute("page", typeService.findAll(filter, pageable));
			model.addAttribute("models", typeService.findByCategoryId(categoryId));
			model.addAttribute("colors", colorService.findAll());
			model.addAttribute("memories", memoryService.findAll());
			
			return "user-category";
		}
		
		
		@RequestMapping("/shopping")
		public <sCart> String shopping( Model model, @CookieValue(defaultValue="0", name="userId") int userId,Integer modelId,  @ModelAttribute("cart") ShopingCart  cart ){
			model.addAttribute("typies", typeService.findAll());
			model.addAttribute("models", typeService.findByUserId(userId));
			model.addAttribute("setting", new Setting());
			BigDecimal totalPrice = new BigDecimal(0); 
			for (project.entity.Model type : typeService.findByUserId(userId)) { 
			totalPrice = totalPrice.add(type.getPrice()); 
			model.addAttribute("totalPrice", totalPrice);
		}   
			HashMap<project.entity.Model, Integer> sCart = new HashMap<project.entity.Model, Integer>();
				for(project.entity.Model shopingcart : typeService.findByUserId(userId)){
					shopingcart.getId();
					shopingcart.getName();
					shopingcart.getPrice();
					shopingcart.getColor(); 
					shopingcart.getMemory();
					shopingcart.getVersion();
					if(!sCart.containsKey(shopingcart)){
						sCart.put(shopingcart, 1);
					}else{
						sCart.put(shopingcart, sCart.get(shopingcart)+1);
					}
					
					model.addAttribute("sCart", sCart);
					 
				}
				return "user-shopping";
		}
		
		
		@RequestMapping("/compare")
		public <sCart> String compare( Model model, @CookieValue(defaultValue="0", name="userId") int userId,Integer modelId,  @ModelAttribute("compare") Compare  compare ){
			model.addAttribute("typies", typeService.findAll());
			model.addAttribute("models", typeService.findByUserIdforCompare(userId));
			model.addAttribute("setting", new Setting());
		//	BigDecimal totalPrice = new BigDecimal(0); 
		//	for (project.entity.Model type : typeService.findByUserId(userId)) { 
		//	totalPrice = totalPrice.add(type.getPrice()); 
		//	model.addAttribute("totalPrice", totalPrice);
	//	}	
			HashMap<project.entity.Model, Integer> Compares = new HashMap<project.entity.Model, Integer>();
				for(project.entity.Model compares : typeService.findByUserIdforCompare(userId)){
					compares.getId();
					compares.getName();
					compares.getPrice();
					compares.getMemory();
					compares.getVersion();
					compares.getDiagonal();
					compares.getProcessor();
					compares.getRam();
					compares.getRear_camera();
					compares.getFront_camera();
					compares.getBattery();
					compares.getWeight();
					compares.getKit();
					
					if(!Compares.containsKey(compares)){
						Compares.put(compares, 1);
					}else{
						Compares.put(compares, Compares.get(compares)+1);
					}
					
					model.addAttribute("Compares", Compares);
				}
				
				
			
				return "user-compare";
		}
		
	
	
		@PostMapping("/shopping")
		public String shoping(@ModelAttribute("setting")  SettingForm form, BindingResult br ,Model model,HttpServletRequest request){
			settingService.save(form);
			return "redirect:/bought";
		}
		
		
		@GetMapping("/buy/{modelId}")
		public String buy(Model model, @CookieValue(defaultValue="0", name="userId") int userId, @PathVariable int modelId){ 
			userService.addToShoppingCart(userId, modelId);
			return "redirect:/";
		}
		
		@GetMapping("/shopping/buy/{modelId}")
		public String cartPlus(Model model, @CookieValue(defaultValue="0", name="userId") int userId, @PathVariable int modelId){ 
			userService.addToShoppingCart(userId, modelId);
			return "redirect:/shopping";
		}
		
		@GetMapping("/del/{modelId}")
		public String remove(Model model, @CookieValue(defaultValue = "0", name = "userId") int userId, @PathVariable int modelId) {
			userService.removeToShoppingCart(userId, modelId);
			
			return "redirect:/shopping";
		}
		
		@GetMapping("/compare/del/{modelId}")
		public String removeCompare(Model model, @CookieValue(defaultValue = "0", name = "userId") int userId, @PathVariable int modelId) {
			userService.removeCompare(userId, modelId);;
			
			return "redirect:/compare";
		}
		
		@GetMapping("/All_del{modelId}")
		public String removeAll(Model model, @CookieValue(defaultValue = "0", name = "userId") int userId) {
			userService.removeAllToShoppingCart(userId);
			return "redirect:/shopping";
		}
		
		@GetMapping("/compare/All_del{modelId}")
		public String removeAllCompare(Model model, @CookieValue(defaultValue = "0", name = "userId") int userId) {
			userService.removeAllCompare(userId);;
			return "redirect:/compare";
		}
	
		@RequestMapping("/model/{id}")
		public String model(@PathVariable int id, Model model){
			model.addAttribute("type", typeService.findForm(id));
			return "user-model";
		}
		
		@GetMapping("/model/buy/{modelId}")
		public String buyModel( @CookieValue(defaultValue="0", name="userId") int userId, @PathVariable int modelId){
			userService.addToShoppingCart(userId, modelId);
			return "redirect:/model/{modelId}";
		}
		
		@GetMapping("/model/add/{modelId}")
		public String addModel( @CookieValue(defaultValue="0", name="userId") int userId, @PathVariable int modelId){
			userService.addToCompare(userId, modelId);
			return "redirect:/model/{modelId}";
		}
		
		
		@GetMapping("/registration")
		public String registration(Model model){
			model.addAttribute("user", new User());
			return "user-registration";
		}
		
		@PostMapping("/registration")
		public String save(@ModelAttribute("user") @Valid User user,BindingResult br,Model model){
			  if (br.hasErrors()) {
		            return "user-registration";
		        }
			userService.save(user);
			return "redirect:/login";
		}
		
		@GetMapping("/login")
		public String login(){
			return "user-login";
		}
	
		@RequestMapping("/admin")
		public String admin(){
			return "admin-admin";
		}
	
		
		@GetMapping("/model/setting/{id}")
		public String setting(@PathVariable int id,Model model){
			model.addAttribute("models", typeService.findAll());
			model.addAttribute("type" ,typeService.findForm(id));
			model.addAttribute("setting", new Setting());
			return "user-setting";
		}
		
		@PostMapping("/model/setting")
		public String setting(@ModelAttribute("setting")  SettingForm form, BindingResult br ,Model model,HttpServletRequest request){
			settingService.save(form);
			return "redirect:/bought";
		}
		
		@GetMapping("/bought")
		public String bought(){
			return "user-bought";
		}
	
		

}
