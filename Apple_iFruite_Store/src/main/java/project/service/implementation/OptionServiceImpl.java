package project.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.entity.Option;
import project.repository.OptionRepository;
import project.service.OptionService;

@Service
public class OptionServiceImpl implements OptionService {

	@Autowired
	private OptionRepository kitRepository;

	@Override
	public List<Option> findAll() {
		return kitRepository.findAll();
	}

	@Override
	public Option findOne(Integer id) {
		return kitRepository.findOne(id);
	}

	@Override
	public void delete(int id) {
		kitRepository.delete(id);
	}

	@Override
	public void save(Option entity) {
		kitRepository.save(entity);
		
	}

	@Override
	public Option findByName(String name) {
		return kitRepository.findByName(name);
	}
	
	
}
