package project.service;

import java.util.List;

import project.entity.Color;

public interface ColorService {

	List<Color> findAll();
	Color findOne(Integer id);
	void delete(int id); 
	void save(Color entity);
	Color findByName(String name);
	
}
