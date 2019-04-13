package project.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import project.entity.Model;
import project.specification.TypeSpecification;

public interface TypeRepository extends JpaRepository<Model, Integer>,  JpaSpecificationExecutor<Model>  {
	
	@Query("SELECT a FROM Model a "
			+ " LEFT JOIN FETCH a.color"
			+ " LEFT JOIN FETCH a.memory "
			+ " LEFT JOIN FETCH a.processor "
			+ " LEFT JOIN FETCH a.diagonal"
			+ " LEFT JOIN FETCH a.weight "
			+ " LEFT JOIN FETCH a.battery"
			+ " LEFT JOIN FETCH a.kit"
			+ " LEFT JOIN FETCH a.operating_system"
			+ " LEFT JOIN FETCH a.category"
			+ " LEFT JOIN FETCH a.ram"
			+ " LEFT JOIN FETCH a.front_camera"
			+ " LEFT JOIN FETCH a.rear_camera")
	List<Model> findAll();
	@Query("SELECT a FROM Model a"
			+ " LEFT JOIN FETCH a.color "
			+ " LEFT JOIN FETCH a.memory "
			+ " LEFT JOIN FETCH a.processor "
			+ " LEFT JOIN FETCH a.diagonal "
			+ " LEFT JOIN FETCH a.weight "
			+ " LEFT JOIN FETCH a.battery"
			+ " LEFT JOIN FETCH a.kit"
			+ " LEFT JOIN FETCH a.operating_system"
			+ " LEFT JOIN FETCH a.category"
			+ " LEFT JOIN FETCH a.ram"
			+ " LEFT JOIN FETCH a.front_camera"
			+ " LEFT JOIN FETCH a.rear_camera"
			+ "  WHERE a.id=?1")
	Model findOne(int id);

	@Query(value="SELECT a FROM Model a"
			+ " LEFT JOIN FETCH a.color"
			+ " LEFT JOIN FETCH a.memory "
			+ " LEFT JOIN FETCH a.processor "
			+ " LEFT JOIN FETCH a.diagonal"
			+ " LEFT JOIN FETCH a.weight "
			+ " LEFT JOIN FETCH a.battery"
			+ " LEFT JOIN FETCH a.kit"
			+ " LEFT JOIN FETCH a.operating_system"
			+ " LEFT JOIN FETCH a.category"
			+ " LEFT JOIN FETCH a.ram"
			+ " LEFT JOIN FETCH a.front_camera"
			+ " LEFT JOIN FETCH a.rear_camera",
			countQuery="SELECT count(a.id) FROM Model a")
	Page<Model> findAll(Pageable pageable);


//	@Query("SELECT COUNT(*) FROM Model a JOIN a.model GROUP BY model HAVING COUNT(*)>1")
	@Query("SELECT sc.count FROM User u JOIN u.shopingCart sc WHERE u.id=?1")
	Integer findCount(int id);
	
//	@Query("SELECT COUNT(*) FROM ShopingCart a JOIN a.models GROUP BY model HAVING COUNT(*)>1")
//	List<ShopingCart> findItemCount(int count);
	
//	@Query("SELECT models FROM ShopingCart  models WHERE models=?1")
//	Integer findItemCount(int count);
	
	@Query("SELECT i FROM Model i JOIN i.shopingCarts sc JOIN sc.users u WHERE u.id=?1")
	List<Model> findByUserId(int userId);
	
	@Query("SELECT i FROM Model i JOIN i.compares sc JOIN sc.users u WHERE u.id=?1")
	List<Model> findByUserIdforCompare(int userId);
	
	@Query("SELECT models FROM ShopingCart models WHERE models.id=?1")
	List<Model> findByModelId(Integer modelId);
	
	@Query("SELECT category FROM Model  category  WHERE category.id=?1")
	List<Model> findByCategoryId(Integer categoryId);
	
	Model findByName(String name);
	
	
	
	
	
	
	

	
}
