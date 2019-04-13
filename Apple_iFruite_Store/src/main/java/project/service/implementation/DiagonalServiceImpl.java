package project.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.entity.Diagonal;
import project.repository.DiagonalRepository;
import project.service.DiagonalService;

@Service
public class DiagonalServiceImpl implements DiagonalService {

	@Autowired
	private DiagonalRepository diagonalRepository;

	@Override
	public List<Diagonal> findAll() {
		return diagonalRepository.findAll();
	}

	@Override
	public Diagonal findOne(Integer id) {
		return diagonalRepository.findOne(id);
	}

	@Override
	public void delete(int id) {
		diagonalRepository.delete(id);
	}

	@Override
	public void save(Diagonal entity) {
		diagonalRepository.save(entity);
		
	}

	@Override
	public Diagonal findByName(String name) {
		return diagonalRepository.findByName(name);
	}
	
	
}
