package project.editor;

import java.beans.PropertyEditorSupport;

import project.entity.RearCamera;
import project.service.RearCameraService;

public class RearCameraEditor  extends PropertyEditorSupport{

	private final RearCameraService rear_cameraService;

	public RearCameraEditor(RearCameraService rear_cameraService) {
		this.rear_cameraService = rear_cameraService;
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		RearCamera rearCamera = rear_cameraService.findOne(Integer.valueOf(text));
		setValue(rearCamera);
	}
}
