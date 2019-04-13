package project.editor;

import java.beans.PropertyEditorSupport;

import project.dto.form.TypeForm;
import project.service.TypeService;

public class TypeEditor extends PropertyEditorSupport {

	private final TypeService typeService;
	
	public TypeEditor(TypeService typeService){
		this.typeService = typeService;
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException{
		TypeForm type = typeService.findForm(Integer.valueOf(text));
		setValue(type);
	}
}
