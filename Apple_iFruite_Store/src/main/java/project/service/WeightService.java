package project.service;

import java.util.List;

import project.entity.Weight;

public interface WeightService {

	List<Weight> findAll();
	Weight findOne(Integer id);
	void delete(int id); 
	void save(Weight entity);
	Weight findByName(String name);
}
