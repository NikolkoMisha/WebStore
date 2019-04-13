package project.service.implementation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.dto.filter.TypeFilter;
import project.dto.form.TypeForm;
import project.entity.Model;
import project.entity.Setting;
import project.repository.CategoryRepository;
import project.repository.TypeRepository;
import project.service.FileWriter;
import project.service.FileWriter.Folder;
import project.service.TypeService;
import project.specification.TypeSpecification;

@Service
public class TypeServiceImpl implements TypeService {

	@Autowired
	private TypeRepository typeRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private FileWriter fileWriter;
	
	@Override
	public List<Model> findAll( ) {
		return typeRepository.findAll();
	}
	
	@Override
	public List<Model> findAll2(TypeFilter filter, Integer categoryId) {
		 
//		 typeRepository.findAll(new TypeSpecification(filter)).contains();
		System.out.println("---------------------------------------------------------------");
		List<Model> typies = typeRepository.findAll(new TypeSpecification(filter));
		
		
		
//		System.out.println(typeRepository.findAll(new TypeSpecification(filter)).equals(typeRepository.findByCategoryId(categoryId)));
//		System.out.println(typies.get(0));
		
		System.out.println("---------------------------------------------------------------");
		return  typies;
	}
	
	

	@Override
	public Model findOne(int id) {
		return typeRepository.findOne(id);
	}

	@Override
	public void delete(int id) {
		typeRepository.delete(id);
	}
	
//	@Override
//	public void save(Type entity) {
//		if(fileWriter.write(Folder.TYPE, entity.getFile(), entity.getId())){
//			if(entity.getVersion()==null)entity.setVersion(0);
//			else entity.setVersion(entity.getVersion()+1);}
//		typeRepository.save(entity);
//	}

	
	@Override
	@Transactional
	public void save(TypeForm  form){
		Model model = new Model();
		model.setId(form.getId());
		model.setName(form.getName());
		model.setPrice(new BigDecimal(form.getPrice().replace(',', '.')));
		model.setMemory(form.getMemory());
		model.setProcessor(form.getProcessor());
		model.setColor(form.getColor());
		model.setDiagonal(form.getDiagonal());
		model.setCategory(form.getCategory());
		model.setWeight(form.getWeight());
		model.setKit(form.getKit());
		model.setBattery(form.getBattery());
		model.setOperating_system(form.getOperating_system());
		model.setFront_camera(form.getFront_camera());
		model.setRear_camera(form.getRear_camera());
		model.setRam(form.getRam());
		model = typeRepository.saveAndFlush(model);
		if(fileWriter.write(Folder.TYPE, form.getFile(), model.getId())){
			if(model.getVersion()==null)model.setVersion(0);
			else model.setVersion(model.getVersion()+1);}
		typeRepository.save(model);
	}
	
//	HashMap<project.entity.Model, Integer> sCart = new HashMap<project.entity.Model, Integer>();
//	for(project.entity.Model shopingcart : typeService.findByUserId(userId)){
//		shopingcart.getId();
//		shopingcart.getName();
//		shopingcart.getPrice();
//		shopingcart.getColor();
//		shopingcart.getMemory();
//		shopingcart.getVersion();
//		if(!sCart.containsKey(shopingcart)){
//			sCart.put(shopingcart, 1);
//		}else{
//			sCart.put(shopingcart, sCart.get(shopingcart)+1);
//		}




	@Override
	public Page<Model> findAll(TypeFilter filter,Pageable pageable) {
		System.out.println("---------------------------------------------------------------");
		Page<Model> typies = typeRepository.findAll(new TypeSpecification(filter),pageable);
		System.out.println("---------------------------------------------------------------");
		return typies;
	}

	
	@Override
	public List<Model> findByCategoryId(Integer categoryId){
		System.out.println("---------------------------------------------------------------");
		
		List<Model> typies = typeRepository.findByCategoryId(categoryId);
		
		System.out.println("---------------------------------------------------------------");
		return typies;
	}
	

	@Override
	@Transactional
	public TypeForm findForm(int id) {
			Model model = findOne(id);
			TypeForm form = new TypeForm();
			form.setId(model.getId());
			form.setPrice(String.valueOf(model.getPrice()));
			form.setColor(model.getColor());
			form.setMemory(model.getMemory());
			form.setCategory(model.getCategory());
			form.setProcessor(model.getProcessor());
			form.setName(model.getName());
			form.setBattery(model.getBattery());
			form.setDiagonal(model.getDiagonal());
			form.setWeight(model.getWeight());
			form.setKit(model.getKit());
			form.setOperating_system(model.getOperating_system());
			form.setFront_camera(model.getFront_camera());
			form.setRear_camera(model.getRear_camera());
			form.setRam(model.getRam());
		return form;
	}
	
	

	
	@Override
	public int findCount(int id) {
		Integer count = typeRepository.findCount(id);
		if(count==null)return 0;
		return count;
	}

	@Override
	public List<Model> findByUserId(int userId) {
		return typeRepository.findByUserId(userId);
	}

	@Override
	public List<Model> findByUserIdforCompare(int userId) {
		return typeRepository.findByUserIdforCompare(userId);
	}


	@Override
	public List<Model> findByModelId(Integer modelId) {
		return typeRepository.findByModelId(modelId);
	}
	

	

	
//	@Override
//	public int findItemCount(int count){
//		Integer counter = typeRepository.findItemCount(count);
//		if(counter == null) return 0 ;
//		return counter;
//		}
}




	
	

