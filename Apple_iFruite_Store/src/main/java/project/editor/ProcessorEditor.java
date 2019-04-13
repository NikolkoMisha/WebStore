package project.editor;

import java.beans.PropertyEditorSupport;

import project.entity.Processor;
import project.service.ProcessorService;

public class ProcessorEditor extends PropertyEditorSupport {

private final ProcessorService processorService;
	
	public ProcessorEditor(ProcessorService processorService){
		this.processorService =  processorService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Processor processor = processorService.findOne(Integer.valueOf(text));
		setValue(processor);
	}
}
