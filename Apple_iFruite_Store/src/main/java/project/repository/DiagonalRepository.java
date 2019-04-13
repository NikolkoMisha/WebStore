package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.entity.Diagonal;

public interface DiagonalRepository extends JpaRepository<Diagonal, Integer> {

	Diagonal findByName(String name);

}