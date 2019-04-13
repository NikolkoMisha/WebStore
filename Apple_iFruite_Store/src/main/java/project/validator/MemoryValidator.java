package project.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import project.entity.Memory;
import project.service.MemoryService;



public class MemoryValidator implements Validator {

	private final MemoryService memoryService;
	
	public MemoryValidator(MemoryService memoryService){
		this.memoryService = memoryService;
	}
	
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Memory.class.equals(clazz);
	}


	@Override
	public void validate(Object target, Errors errors) {
		Memory memory = (Memory) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "",  "Неможе бути пустим");
		if (memoryService.findByName(memory.getName())!=null){
			errors.rejectValue("name", "", "Вже існує");
		}
	}
}