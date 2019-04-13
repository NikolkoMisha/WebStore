package project.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.entity.Processor;
import project.repository.ProcessorRepository;
import project.service.ProcessorService;

@Service
public class ProcessorServiceImpl implements ProcessorService {

	@Autowired
	private ProcessorRepository processorRepository;
	
	@Override
	public List<Processor> findAll() {
		return processorRepository.findAll();
	}

	@Override
	public Processor findOne(Integer id) {
		return processorRepository.findOne(id);
	}

	@Override
	public void delete(int id) {
		processorRepository.delete(id);
		
	}

	@Override
	public void save(Processor entity) {
		processorRepository.save(entity);
		
	}

	@Override
	public Processor findByName(String name) {
		return processorRepository.findByName(name);
	}

}
