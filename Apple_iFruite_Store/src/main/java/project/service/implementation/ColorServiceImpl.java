package project.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.entity.Color;
import project.repository.ColorRepository;
import project.service.ColorService;

@Service
public class ColorServiceImpl implements ColorService {

	@Autowired
	private ColorRepository colorRepository;

	@Override
	public List<Color> findAll() {
		return colorRepository.findAll();
	}

	@Override
	public Color findOne(Integer id) {
		return colorRepository.findOne(id);
	}

	@Override
	public void delete(int id) {
		colorRepository.delete(id);
	}

	@Override
	public void save(Color entity) {
		colorRepository.save(entity);
		
	}

	@Override
	public Color findByName(String name) {
		return colorRepository.findByName(name);
	}
	
	
}
