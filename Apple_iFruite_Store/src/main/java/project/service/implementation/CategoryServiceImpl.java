package project.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.dto.filter.CategoryFilter;
import project.dto.form.CategoryForm;
import project.entity.Category;
import project.repository.CategoryRepository;
import project.service.CategoryService;
import project.service.FileWriter;
import project.service.FileWriter.Folder;
import project.specification.CategorySpecification;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private FileWriter fileWriter;
	
	@Override
	public Page<Category> findAll(CategoryFilter filter,Pageable pageable) {
		Page<Category> categories = categoryRepository.findAll(new CategorySpecification(filter), pageable);
		return categories;
	}

	@Override
	public Category findOne(int id) {
		return categoryRepository.findOne(id);
	}
	
//	@Override
//	public void save(Category entity){
//		entity.getId();
//		entity.getName();
//		entity.getCommodity();
//		categoryRepository.save(entity);
//	}
	
	
	@Override
	@Transactional
	public void save(CategoryForm  form){
		Category category = new Category();
		category.setId(form.getId());
		category.setName(form.getName());
		category.setCommodity(form.getCommodity());
		category = categoryRepository.saveAndFlush(category);
		if(fileWriter.write(Folder.CATEGORY, form.getFile(), category.getId())){
			if(category.getVersion()==null)category.setVersion(0);
			else category.setVersion(category.getVersion()+1);}
		categoryRepository.save(category);
	}
	
	@Override
	@Transactional
	public CategoryForm findForm(int id) {
		Category category = findOne(id);
		CategoryForm form = new CategoryForm();
		form.setId(category.getId());
		form.setName(category.getName());
		form.setCommodity(category.getCommodity());
		return form;
	}

	@Override
	public void delete(Integer id) {
		categoryRepository.delete(id);
	}


	
//	@Override
//	public Category findUnique(String name, Commodity commodity) {
//		return categoryRepository.findUnique( name.getName(),commodity.getId());
//	}

	@Override
	public Category findByName(String name) {
		return categoryRepository.findByName(name);
	}

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}
	
	@Override
	public List<Category> findByCommodityId(Integer commodityId) {
		return categoryRepository.findByCommodityId(commodityId);
	}
	

}