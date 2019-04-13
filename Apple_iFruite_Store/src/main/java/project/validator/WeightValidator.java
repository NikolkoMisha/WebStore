package project.validator;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import project.entity.Weight;
import project.service.WeightService;

public class WeightValidator implements Validator {

	private final WeightService weightService;
	
	public WeightValidator(WeightService weightService){
		this.weightService = weightService;
	}
	
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Weight.class.equals(clazz);
	}


	@Override
	public void validate(Object target, Errors errors) {
		Weight weight = (Weight) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "",  "Неможе бути пустим");
		if (weightService.findByName(weight.getName())!=null){
			errors.rejectValue("name", "", "Вже існує");
		}
	}
}


