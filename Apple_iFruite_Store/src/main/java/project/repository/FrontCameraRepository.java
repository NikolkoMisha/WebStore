package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.entity.FrontCamera;

public interface FrontCameraRepository extends JpaRepository<FrontCamera, Integer>{

	FrontCamera findByName(String name);
}
