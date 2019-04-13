package project.service;

import java.util.List;

import project.entity.Option;


public interface OptionService {

	List<Option> findAll();
	Option findOne(Integer id);
	void delete(int id); 
	void save(Option entity);
	Option findByName(String name);
	
}
