package project.service;

import java.util.List;

import project.entity.Memory;

public interface MemoryService {

	List<Memory> findAll();
	Memory findOne(Integer id);
	void delete(int id); 
	void save(Memory entity);
	Memory findByName(String name);
	
}
