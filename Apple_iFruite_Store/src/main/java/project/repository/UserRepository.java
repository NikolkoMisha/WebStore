package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByLogin(String login);

	User findByEmail(String email);

	

}
