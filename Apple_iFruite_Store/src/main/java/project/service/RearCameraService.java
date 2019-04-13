package project.service;

import java.util.List;

import project.entity.RearCamera;

public interface RearCameraService {

	List<RearCamera> findAll();
	RearCamera findOne(Integer id);
	void delete(int id); 
	void save(RearCamera entity);
	RearCamera findByName(String name);
}
