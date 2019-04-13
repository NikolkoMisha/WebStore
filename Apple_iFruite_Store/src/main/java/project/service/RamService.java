package project.service;

import java.util.List;

import project.entity.Ram;

public interface RamService {

	List<Ram> findAll();
	Ram findOne(Integer id);
	void delete(int id); 
	void save(Ram entity);
	Ram findByName(String name);
}
