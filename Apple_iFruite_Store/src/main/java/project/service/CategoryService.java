package project.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import project.dto.filter.CategoryFilter;
import project.dto.form.CategoryForm;
import project.entity.Category;

public interface CategoryService  {
	
	List<Category> findAll();
	Category findOne(int id);
	void delete(Integer id);
//	void save(Category entity);
	void save(CategoryForm form);
	CategoryForm findForm(int id);
//	Category findUnique(Category category, Commodity commodity);
	Page<Category> findAll(CategoryFilter filtery, Pageable pageable);
	List<Category> findByCommodityId(Integer commodityId);
	Category findByName(String name);
	
	
}
