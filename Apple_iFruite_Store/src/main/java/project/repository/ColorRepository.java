package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.entity.Color;

public interface ColorRepository extends JpaRepository<Color, Integer> {

	Color findByName(String name);

}
