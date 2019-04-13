package project.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import project.dto.form.CommodityForm;

import project.service.CommodityService;

public class CommodityValidator implements Validator {

	private final CommodityService commodityService;
	
	public CommodityValidator(CommodityService commodityService){
		this.commodityService = commodityService;
	}
	
	
	@Override
	public boolean supports(Class<?> clazz) {
		return CommodityForm.class.equals(clazz);
	}


	@Override
	public void validate(Object target, Errors errors) {
		CommodityForm form = (CommodityForm) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "",  "Неможе бути пустим");
		if (commodityService.findByName(form.getName())!=null){
			errors.rejectValue("name", "", "Already exist");
		}
	}
}
