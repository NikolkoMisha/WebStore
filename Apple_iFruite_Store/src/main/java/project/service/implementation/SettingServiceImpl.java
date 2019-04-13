package project.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.dto.form.SettingForm;
import project.entity.Setting;
import project.repository.SettingRepository;
import project.service.SettingService;

@Service
public class SettingServiceImpl implements SettingService {

	@Autowired 
	private SettingRepository settingRepository;
	
	@Override
	public List<Setting> findAll() {
		return settingRepository.findAll();
	}

	@Override
	public Setting findOne(int id) {
		return settingRepository.findOne(id);
	}

	@Override
	public void delete(Integer id) {
		settingRepository.delete(id);
	}

	
	@Override
	@Transactional
	public void save(SettingForm form){
		Setting setting = new Setting();
		setting.setId(form.getId());
		setting.setName(form.getName());
		setting.setPhone(form.getPhone());
		setting.setCount(form.getCount());
		setting.setModel(form.getModel());
		setting = settingRepository.saveAndFlush(setting);
		settingRepository.save(setting);
	}
	
	@Override
	@Transactional
	public SettingForm findForm(int id){
		Setting setting = findOne(id);
		SettingForm form = new SettingForm();
		form.setId(setting.getId());
		form.setName(setting.getName());
		form.setPhone(setting.getPhone());
		form.setCount(setting.getCount());
		form.setModel(setting.getModel());
		return form;
	}
	

}
