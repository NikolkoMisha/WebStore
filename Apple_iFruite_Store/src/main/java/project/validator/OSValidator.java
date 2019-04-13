package project.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import project.entity.OS;
import project.service.OSService;

public class OSValidator implements Validator {

	private final OSService operating_systemService;
	
	public OSValidator(OSService operating_systemService){
		this.operating_systemService = operating_systemService;
	}
	
	
	@Override
	public boolean supports(Class<?> clazz) {
		return OS.class.equals(clazz);
	}


	@Override
	public void validate(Object target, Errors errors) {
		OS operating_system = (OS) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "",  "Неможе бути пустим");
		if (operating_systemService.findByName(operating_system.getName())!=null){
			errors.rejectValue("name", "", "Вже існує");
		}
	}
}
