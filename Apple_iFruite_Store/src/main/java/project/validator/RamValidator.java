package project.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import project.entity.Ram;
import project.service.RamService;

public class RamValidator implements Validator{

	private final RamService ramService;

	public RamValidator(RamService ramService) {
		this.ramService = ramService;
	}
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Ram.class.equals(clazz);
	}


	@Override
	public void validate(Object target, Errors errors) {
		Ram ram = (Ram) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "",  "Неможе бути пустим");
		if (ramService.findByName(ram.getName())!=null){
			errors.rejectValue("name", "", "Вже існує");
		}
	}

}
