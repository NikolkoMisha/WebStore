package project.service;

import java.util.List;

import project.entity.Battery;


public interface BatteryService {

	List<Battery> findAll();
	Battery findOne(Integer id);
	void delete(int id); 
	void save(Battery entity);
	Battery findByName(String name);
	
}
