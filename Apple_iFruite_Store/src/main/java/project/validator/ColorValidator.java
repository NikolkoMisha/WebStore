package project.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import project.entity.Color;
import project.service.ColorService;

public class ColorValidator implements Validator {

	private final ColorService colorService;
	
	public ColorValidator(ColorService colorService){
		this.colorService = colorService;
	}
	
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Color.class.equals(clazz);
	}


	@Override
	public void validate(Object target, Errors errors) {
		Color color = (Color) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "",  "Неможе бути пустим");
		if (colorService.findByName(color.getName())!=null){
			errors.rejectValue("name", "", "Вже існує");
		}
	}
}

