package project.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.entity.OS;
import project.repository.OSRepository;
import project.service.OSService;

@Service
public class OSServiceImpl implements OSService {

	@Autowired
	private OSRepository operating_systemRepository;

	@Override
	public List<OS> findAll() {
		return operating_systemRepository.findAll();
	}

	@Override
	public OS findOne(Integer id) {
		return operating_systemRepository.findOne(id);
	}

	@Override
	public void delete(int id) {
		operating_systemRepository.delete(id);
	}

	@Override
	public void save(OS entity) {
		operating_systemRepository.save(entity);
		
	}

	@Override
	public OS findByName(String name) {
		return operating_systemRepository.findByName(name);
	}
	
	
}