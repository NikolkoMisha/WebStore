package project.service;

import java.util.List;

import project.entity.FrontCamera;

public interface FrontCameraService {

	List<FrontCamera> findAll();
	FrontCamera findOne(Integer id);
	void delete(int id); 
	void save(FrontCamera entity);
	FrontCamera findByName(String name);
}
