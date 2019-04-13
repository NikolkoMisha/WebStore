package project.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.entity.FrontCamera;
import project.repository.FrontCameraRepository;
import project.service.FrontCameraService;

@Service
public class FrontCameraServiceImpl implements FrontCameraService {
	
	@Autowired
	private FrontCameraRepository front_cameraRepository;

	@Override
	public List<FrontCamera> findAll() {
		return front_cameraRepository.findAll();
	}

	@Override
	public FrontCamera findOne(Integer id) {
		return front_cameraRepository.findOne(id);
	}

	@Override
	public void delete(int id) {
		front_cameraRepository.delete(id);
	}

	@Override
	public void save(FrontCamera entity) {
		front_cameraRepository.save(entity);
		
	}

	@Override
	public FrontCamera findByName(String name) {
		return front_cameraRepository.findByName(name);
	}

}
