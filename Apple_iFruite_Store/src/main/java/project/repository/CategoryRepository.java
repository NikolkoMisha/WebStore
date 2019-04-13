package project.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import project.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>, JpaSpecificationExecutor<Category> {

		@Query("SELECT a FROM Category a "
				+ " LEFT JOIN FETCH a.commodity")
		List<Category> findAll();
		@Query("SELECT a FROM Category a"
				+ " LEFT JOIN FETCH a.commodity "
				+ "  WHERE a.id=?1")
		Category findOne(Integer id);
	
	@Query(value="SELECT a FROM Category a LEFT JOIN FETCH a.commodity",
			countQuery="SELECT count(a.id) FROM Category a")
	Page<Category> findAll(Pageable pageable);
	
	@Query("SELECT i FROM Category i JOIN i.commodity c  WHERE c.id=?1")
	List<Category> findByCommodityId(Integer commodityId);

	Category findByName(String name); 
	
	
}
