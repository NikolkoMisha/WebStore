package project.service;

import java.util.List;

import project.dto.form.SettingForm;
import project.entity.Setting;


public interface SettingService {

	List<Setting> findAll();
	
	Setting findOne(int id);

	void delete(Integer id);

	void save(SettingForm form);
	
	SettingForm findForm(int id);
}
