package project.service;

import java.util.List;

import project.entity.Diagonal;

public interface DiagonalService {

	List<Diagonal> findAll();
	Diagonal findOne(Integer id);
	void delete(int id); 
	void save(Diagonal entity);
	Diagonal findByName(String name);
	
}
