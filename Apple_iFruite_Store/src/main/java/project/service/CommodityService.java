package project.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import project.dto.filter.SimpleFilter;
import project.dto.form.CommodityForm;
import project.entity.Commodity;

public interface CommodityService {

		List<Commodity> findAll();
		void delete(int id);
		void save(CommodityForm form);
		Commodity findOne(Integer id);
		Commodity findByName(String commodity); 
		Page<Commodity> findAll(Pageable pageable, SimpleFilter filter);
}
