package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.entity.RearCamera;

public interface RearCameraRepository extends JpaRepository<RearCamera, Integer>{

	RearCamera findByName(String name);
}
