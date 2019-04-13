package project.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import project.entity.Commodity;

public interface CommodityRepository extends JpaRepository<Commodity, Integer>, JpaSpecificationExecutor<Commodity> {
	
	@Query("SELECT a FROM Commodity a")
	List<Commodity> findAll();
	
	@Query("SELECT a FROM Commodity a")
	Page<Commodity> findAll(Pageable pageable);
	
	Commodity findByName(String name);


}
