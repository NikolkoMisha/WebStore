package project.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.entity.Ram;
import project.repository.RamRepository;
import project.service.RamService;

@Service
public class RamServiceImpl implements RamService  {

	@Autowired
	private RamRepository ramRepository;

	@Override
	public List<Ram> findAll() {
		return ramRepository.findAll();
	}

	@Override
	public Ram findOne(Integer id) {
		return ramRepository.findOne(id);
	}

	@Override
	public void delete(int id) {
		ramRepository.delete(id);
	}

	@Override
	public void save(Ram entity) {
		ramRepository.save(entity);
		
	}

	@Override
	public Ram findByName(String name) {
		return ramRepository.findByName(name);
	}
	
	
}
