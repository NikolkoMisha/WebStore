package project.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.entity.Battery;
import project.repository.BatteryRepository;
import project.service.BatteryService;

@Service
public class BatteryServiceImpl implements BatteryService {

	@Autowired
	private BatteryRepository batteryRepository;

	@Override
	public List<Battery> findAll() {
		return batteryRepository.findAll();
	}

	@Override
	public Battery findOne(Integer id) {
		return batteryRepository.findOne(id);
	}

	@Override
	public void delete(int id) {
		batteryRepository.delete(id);
	}

	@Override
	public void save(Battery entity) {
		batteryRepository.save(entity);
		
	}

	@Override
	public Battery findByName(String name) {
		return batteryRepository.findByName(name);
	}
	
	
}