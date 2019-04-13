package project.validator;

import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import project.dto.form.TypeForm;
import project.service.TypeService;

public class TypeValidator implements Validator {
	
	private final static Pattern REG = Pattern.compile("^([0-9]{1,17}\\.[0-9]{1,2})|([0-9]{1,17}\\,[0-9]{1,2})|([0-9]{1,17})$");

	private TypeService typeService;
	
	public TypeValidator(TypeService typeService) {
		this.typeService = typeService;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(TypeForm.class);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		TypeForm form = (TypeForm) target;
		if(!REG.matcher(form.getPrice()).matches()){
			errors.rejectValue("price", "", "введіть тільки 2 знаки після коми");
		}
		
	}
	
}
