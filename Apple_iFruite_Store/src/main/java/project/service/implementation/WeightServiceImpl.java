package project.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.entity.Weight;
import project.repository.WeightRepository;
import project.service.WeightService;

@Service
public class WeightServiceImpl implements WeightService {

	@Autowired
	private WeightRepository weightRepository;
	
	@Override
	public List<Weight> findAll() {
		return weightRepository.findAll();
	}

	@Override
	public Weight findOne(Integer id) {
		return weightRepository.findOne(id);
	}

	@Override
	public void delete(int id) {
		weightRepository.delete(id);
	}

	@Override
	public void save(Weight entity) {
		weightRepository.save(entity);
	}

	@Override
	public Weight findByName(String name) {
		return weightRepository.findByName(name);
	}

}
