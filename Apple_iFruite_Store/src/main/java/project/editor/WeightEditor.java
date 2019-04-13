package project.editor;

import java.beans.PropertyEditorSupport;

import project.entity.Weight;
import project.service.WeightService;


public class WeightEditor extends PropertyEditorSupport {
	
	private final WeightService weightService;
	
	public WeightEditor(WeightService weightService){
		this.weightService =  weightService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Weight weight = weightService.findOne(Integer.valueOf(text));
		setValue(weight);
	}
}
