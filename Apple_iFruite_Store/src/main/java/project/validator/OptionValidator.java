package project.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import project.entity.Option;
import project.service.OptionService;


public class OptionValidator implements Validator {

	private final OptionService kitService;
	
	public OptionValidator(OptionService optionService){
		this.kitService = optionService;
	}
	
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Option.class.equals(clazz);
	}


	@Override
	public void validate(Object target, Errors errors) {
		Option kit = (Option) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "",  "Неможе бути пустим");
		if (kitService.findByName(kit.getName())!=null){
			errors.rejectValue("name", "", "Вже існує");
		}
	}
}
