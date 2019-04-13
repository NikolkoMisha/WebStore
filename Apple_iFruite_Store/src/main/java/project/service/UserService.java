package project.service;

import java.util.List;

import project.entity.User;

public interface UserService {

	List<User> findAll();
	
	User findOne(int id);
	
	void save(User user);
	
	User findByLogin(String username);
	
	User findByEmail (String email);
	
	void adminsave(User admin);
	
	void delete(int id);
	
	
	int createNewUser();
	
	void addToShoppingCart(int userId, int modelId);
	
	void addToCompare(int userId, int modelId);
	
	void removeToShoppingCart(int userId, int modelId);

	void removeCompare(int userId, int modelId);
	
	void removeAllToShoppingCart(int userId);
	
	void removeAllCompare(int userId);
	
	
	
}
