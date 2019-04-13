package project.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import project.entity.Diagonal;
import project.service.DiagonalService;

public class DiagonalValidator implements Validator {

	private final DiagonalService diagonalService;
	
	public DiagonalValidator(DiagonalService diagonalService){
		this.diagonalService = diagonalService;
	}
	
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Diagonal.class.equals(clazz);
	}


	@Override
	public void validate(Object target, Errors errors) {
		Diagonal diagonal = (Diagonal) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "",  "Неможе бути пустим");
		if (diagonalService.findByName(diagonal.getName())!=null){
			errors.rejectValue("name", "", "Вже існує");
		}
	}
}