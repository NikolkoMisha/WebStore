package project.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import project.entity.Battery;
import project.service.BatteryService;

public class BatteryValidator implements Validator {

	private final BatteryService batteryService;
	
	public BatteryValidator(BatteryService batteryService){
		this.batteryService = batteryService;
	}
	
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Battery.class.equals(clazz);
	}


	@Override
	public void validate(Object target, Errors errors) {
		Battery battery = (Battery) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "",  "Неможе бути пустим");
		if (batteryService.findByName(battery.getName())!=null){
			errors.rejectValue("name", "", "Вже існує");
		}
	}
}
