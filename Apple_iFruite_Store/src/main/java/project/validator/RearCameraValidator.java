package project.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import project.entity.RearCamera;
import project.service.RearCameraService;

public class RearCameraValidator implements Validator{

	private final RearCameraService rear_cameraService;

	public RearCameraValidator(RearCameraService rear_cameraService) {
		this.rear_cameraService = rear_cameraService;
	}
	
	@Override
	public boolean supports(Class<?> clazz) {
		return RearCamera.class.equals(clazz);
	}


	@Override
	public void validate(Object target, Errors errors) {
		RearCamera rearCamera = (RearCamera) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "",  "Неможе бути пустим");
		if (rear_cameraService.findByName(rearCamera.getName())!=null){
			errors.rejectValue("name", "", "Вже існує");
		}
	}
	

}
