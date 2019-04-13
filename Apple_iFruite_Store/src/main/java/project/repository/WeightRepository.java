package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.entity.Weight;

public interface WeightRepository extends JpaRepository<Weight, Integer> {

	Weight findByName(String name);

}
