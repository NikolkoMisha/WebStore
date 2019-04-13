package project.editor;

import java.beans.PropertyEditorSupport;

import project.entity.FrontCamera;
import project.service.FrontCameraService;

public class FrontCameraEditor  extends PropertyEditorSupport{
	
	private final FrontCameraService front_cameraService;
	
	public FrontCameraEditor(FrontCameraService front_cameraService) {
		this.front_cameraService = front_cameraService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		FrontCamera frontCamera =  front_cameraService.findOne(Integer.valueOf(text));
		setValue(frontCamera);
	}

}
