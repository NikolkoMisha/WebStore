package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.entity.Ram;

public interface RamRepository extends JpaRepository<Ram, Integer> {

	Ram findByName(String name);
}
