package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.entity.Battery;

public interface BatteryRepository extends JpaRepository<Battery, Integer> {

	Battery findByName(String name);

}
