package project.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.entity.RearCamera;
import project.repository.RearCameraRepository;
import project.service.RearCameraService;

@Service
public class RearCameraServiceImpl implements RearCameraService  {
	
	@Autowired
	private RearCameraRepository rear_cameraRepository;

	@Override
	public List<RearCamera> findAll() {
		return rear_cameraRepository.findAll();
	}

	@Override
	public RearCamera findOne(Integer id) {
		return rear_cameraRepository.findOne(id);
	}

	@Override
	public void delete(int id) {
		rear_cameraRepository.delete(id);
	}

	@Override
	public void save(RearCamera entity) {
		rear_cameraRepository.save(entity);
		
	}

	@Override
	public RearCamera findByName(String name) {
		return rear_cameraRepository.findByName(name);
	}

}
