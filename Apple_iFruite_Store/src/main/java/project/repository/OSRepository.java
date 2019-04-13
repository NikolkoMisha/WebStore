package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import project.entity.OS;

public interface OSRepository extends JpaRepository<OS, Integer> {

	OS findByName(String name);

}
