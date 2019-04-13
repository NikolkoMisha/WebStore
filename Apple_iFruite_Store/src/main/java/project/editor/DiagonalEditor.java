package project.editor;

import java.beans.PropertyEditorSupport;

import project.entity.Diagonal;
import project.service.DiagonalService;

public class DiagonalEditor extends PropertyEditorSupport {
	
	private final DiagonalService diagonalService;
	
	public DiagonalEditor(DiagonalService diagonalService){
		this.diagonalService =  diagonalService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Diagonal diagonal = diagonalService.findOne(Integer.valueOf(text));
		setValue(diagonal);
	}
}
