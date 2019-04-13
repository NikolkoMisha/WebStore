package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.entity.Option;

public interface OptionRepository extends JpaRepository<Option, Integer> {

	Option findByName(String name);

}

