package project.editor;

import java.beans.PropertyEditorSupport;

import project.entity.Setting;
import project.service.SettingService;



public class SettingEditor extends PropertyEditorSupport {

	private final SettingService settingService;
	
	public SettingEditor(SettingService settingService){
		this.settingService =  settingService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Setting setting = settingService.findOne(Integer.valueOf(text));
		setValue(setting);
	}
}
