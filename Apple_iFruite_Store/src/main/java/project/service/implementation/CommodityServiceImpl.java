package project.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.dto.filter.SimpleFilter;
import project.dto.form.CommodityForm;
import project.entity.Commodity;
import project.repository.CommodityRepository;
import project.service.CommodityService;
import project.service.FileWriter;
import project.service.FileWriter.Folder;

@Service
public class CommodityServiceImpl implements CommodityService {

	@Autowired
	private CommodityRepository commodityRepository;
	
	@Autowired
	private FileWriter fileWriter;
	
	@Override
	public List<Commodity> findAll() {
		return commodityRepository.findAll();
	}

	@Override
	public void delete(int id) {
		commodityRepository.delete(id);
	}
	
	@Override
	@Transactional
	public void save(CommodityForm form) {
		Commodity commodity = new Commodity();
		commodity.setId(form.getId());
		commodity.setName(form.getName());
		commodity = commodityRepository.saveAndFlush(commodity);
		if(fileWriter.write(Folder.COMMODITY, form.getFile(), commodity.getId())){
				if(commodity.getVersion()==null)commodity.setVersion(0);
				else commodity.setVersion(commodity.getVersion()+1);}
			commodityRepository.save(commodity);
		}
	

	@Override
	public Commodity findOne(Integer id) {
		return commodityRepository.findOne(id);
	}

	@Override
	public Commodity findByName(String commodity) {
		return commodityRepository.findByName(commodity);
	}

	@Override
	public Page<Commodity> findAll(Pageable pageable, SimpleFilter filter) {
		return commodityRepository.findAll(findByNameLike(filter), pageable);
	}

	private Specification<Commodity> findByNameLike(SimpleFilter filter) {
		return (root, query, cb)->{
			if(filter.getSearch().isEmpty())return null;
			return cb.like(cb.lower(root.get("name")), filter.getSearch().toLowerCase()+"%");
		};
	}
	
}
