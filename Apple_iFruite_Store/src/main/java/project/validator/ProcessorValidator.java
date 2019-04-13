package project.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import project.entity.Processor;
import project.service.ProcessorService;

public class ProcessorValidator implements Validator {

	private final ProcessorService processorService;
	
	public ProcessorValidator(ProcessorService processorService){
		this.processorService = processorService;
	}
	
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Processor.class.equals(clazz);
	}


	@Override
	public void validate(Object target, Errors errors) {
		Processor processor = (Processor) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "",  "Неможе бути пустим");
		if (processorService.findByName(processor.getName())!=null){
			errors.rejectValue("name", "", "Вже існує");
		}
	}
}