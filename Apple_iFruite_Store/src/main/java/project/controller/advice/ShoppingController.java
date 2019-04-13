package project.controller.advice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;

import project.dto.Quantity;
import project.service.TypeService;

@ControllerAdvice
public class ShoppingController {
	
	@Autowired
	private TypeService typeService;
	
	@ModelAttribute("quantity")
	public Quantity getQuantity(@CookieValue(defaultValue="0", name="userId") int userId){
		int count = typeService.findCount(userId);
		return new Quantity(count);
	}

	
	
}
