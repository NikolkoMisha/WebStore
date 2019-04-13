package project.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import project.entity.FrontCamera;
import project.service.FrontCameraService;

public class FrontCameraValidator implements Validator{

	private final FrontCameraService front_cameraService;

	public FrontCameraValidator(FrontCameraService front_cameraService) {
		this.front_cameraService = front_cameraService;
	}
	
	@Override
	public boolean supports(Class<?> clazz) {
		return FrontCamera.class.equals(clazz);
	}


	@Override
	public void validate(Object target, Errors errors) {
		FrontCamera frontCamera = (FrontCamera) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "",  "Неможе бути пустим");
		if (front_cameraService.findByName(frontCamera.getName())!=null){
			errors.rejectValue("name", "", "Вже існує");
		}
	}

}
