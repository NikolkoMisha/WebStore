package project.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





import project.entity.Memory;
import project.repository.MemoryRepository;
import project.service.MemoryService;

@Service
public class MemoryServiceImpl implements MemoryService {

	@Autowired
	private MemoryRepository memoryRepository;

	@Override
	public List<Memory> findAll() {
		return memoryRepository.findAll();
	}

	@Override
	public Memory findOne(Integer id) {
		return memoryRepository.findOne(id);
	}

	@Override
	public void delete(int id) {
		memoryRepository.delete(id);
	}

	@Override
	public void save(Memory entity) {
		memoryRepository.save(entity);
		
	}

	@Override
	public Memory findByName(String name) {
		return memoryRepository.findByName(name);
	}
	
	
}

