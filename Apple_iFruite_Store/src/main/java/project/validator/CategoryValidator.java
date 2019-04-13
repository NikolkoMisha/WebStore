package project.validator;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import project.dto.form.CategoryForm;
import project.entity.Category;
import project.service.CategoryService;

public class CategoryValidator implements Validator {

	private final CategoryService categoryService;
	
	public CategoryValidator(CategoryService categoryService){
		this.categoryService = categoryService;
	}
	
	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(CategoryForm.class);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		CategoryForm category = (CategoryForm) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "",  "Неможе бути пустим");
//		if(errors.getFieldError("category")== null){
//			if(categoryService.findByName(category.getName())!=null){
//				errors.rejectValue("name", "", "��� ����");
//			}
//		}
	}

}