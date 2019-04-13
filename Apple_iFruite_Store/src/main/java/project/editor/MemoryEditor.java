package project.editor;

import java.beans.PropertyEditorSupport;

import project.entity.Memory;
import project.service.MemoryService;

public class MemoryEditor extends PropertyEditorSupport {
	
	private final MemoryService memoryService;
	
	public MemoryEditor(MemoryService memoryService){
		this.memoryService = memoryService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Memory memory = memoryService.findOne(Integer.valueOf(text));
		setValue(memory);
	}
}
