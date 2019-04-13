package project.editor;

import java.beans.PropertyEditorSupport;

import project.entity.Ram;
import project.service.RamService;

public class RamEditor  extends PropertyEditorSupport{

	private final RamService ramService;

	public RamEditor(RamService ramService) {
		this.ramService = ramService;
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Ram ram = ramService.findOne(Integer.valueOf(text));
		setValue(ram);
	}
}
