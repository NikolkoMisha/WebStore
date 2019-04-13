package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.entity.Memory;

public interface MemoryRepository extends JpaRepository<Memory, Integer> {

	Memory findByName(String name);

}
