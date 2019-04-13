package project.editor;

import java.beans.PropertyEditorSupport;

import project.entity.Color;
import project.service.ColorService;

public class ColorEditor extends PropertyEditorSupport {
	
	private final ColorService colorService;
	
	public ColorEditor(ColorService colorService){
		this.colorService =  colorService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Color color = colorService.findOne(Integer.valueOf(text));
		setValue(color);
	}
}