package project.editor;

import java.beans.PropertyEditorSupport;

import project.entity.Option;
import project.service.OptionService;

public class OptionEditor extends PropertyEditorSupport {
	
	private final OptionService optionService;
	
	public OptionEditor(OptionService optionService){
		this.optionService =  optionService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Option option = optionService.findOne(Integer.valueOf(text));
		setValue(option);
	}
}
