package project.editor;

import java.beans.PropertyEditorSupport;

import project.entity.OS;
import project.service.OSService;

public class OSEditor extends PropertyEditorSupport {
	
	private final OSService operating_systemService;
	
	public OSEditor(OSService operating_systemService){
		this.operating_systemService =  operating_systemService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		OS operating_system = operating_systemService.findOne(Integer.valueOf(text));
		setValue(operating_system);
	}
}
