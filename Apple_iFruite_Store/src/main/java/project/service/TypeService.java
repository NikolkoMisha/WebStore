package project.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import project.dto.filter.TypeFilter;
import project.dto.form.TypeForm;
import project.entity.Model;

public interface TypeService  {

	List<Model> findAll();
	List<Model> findAll2(TypeFilter filter, Integer categoryId);
	Model findOne(int id);
	void delete(int id);
	
	void save(TypeForm form);
	TypeForm findForm(int id);
	Page<Model> findAll(TypeFilter filter, Pageable pageable);
	

	int findCount(int id);

	List<Model> findByUserId(int userId);
	List<Model> findByUserIdforCompare(int userId);
	List<Model> findByModelId(Integer modelId);
	List<Model> findByCategoryId(Integer categoryId);
	
	

	

	
}
