package project.service;

import java.util.List;

import project.entity.Processor;

public interface ProcessorService {

	List<Processor> findAll();
	Processor findOne(Integer id);
	void delete(int id); 
	void save(Processor entity);
	Processor findByName(String name);
}
