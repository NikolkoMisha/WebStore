package project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import project.entity.Setting;

public interface SettingRepository extends JpaRepository<Setting, Integer>{

		@Query("SELECT a FROM Setting a "
				+ " LEFT JOIN FETCH a.model")
		List<Setting> findAll();
		@Query("SELECT a FROM Setting a"
				+ " LEFT JOIN FETCH a.model "
				+ "  WHERE a.id=?1")
		Setting findOne(int id);
	
}
