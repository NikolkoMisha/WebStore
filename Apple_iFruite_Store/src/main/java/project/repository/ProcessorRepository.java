package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.entity.Processor;

public interface ProcessorRepository extends JpaRepository<Processor, Integer> {

	Processor findByName(String name);

}
