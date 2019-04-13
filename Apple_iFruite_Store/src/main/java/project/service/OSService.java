package project.service;

import java.util.List;

import project.entity.OS;


public interface OSService {

	List<OS> findAll();
	OS findOne(Integer id);
	void delete(int id); 
	void save(OS entity);
	OS findByName(String name);
	
}
