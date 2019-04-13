package project.service.implementation;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.entity.Compare;
import project.entity.Model;
import project.entity.Role;
import project.entity.ShopingCart;
import project.entity.User;
import project.repository.CompareRepository;
import project.repository.ShopingCartRepository;
import project.repository.TypeRepository;
import project.repository.UserRepository;
import project.service.UserService;

@Service("userDetailsService")
public class UserServiceImpl implements UserService, UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	@Autowired
	private ShopingCartRepository shopingCartRepository;
	
	@Autowired
	private CompareRepository compareRepository;
	
	@Autowired
	private TypeRepository typeRepository;
	
	@Override
	public void save(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		user.setRole(Role.ROLE_USER);
		userRepository.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userRepository.findByLogin(username);
	}
	
	@PostConstruct
	public void addAdmin(){
		User user = userRepository.findByLogin("admin");
		if(user==null){
			user = new User();
			user.setLogin("admin");
			user.setPassword(encoder.encode("admin"));
			user.setRole(Role.ROLE_ADMIN);
			userRepository.save(user);
		}
	}

	
	
	@Override
	public User findByLogin(String username) {
		return userRepository.findByLogin(username);
	}

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public void adminsave(User admin) {
		admin.setPassword(encoder.encode(admin.getPassword()));
		admin.setRole(Role.ROLE_ADMIN);
		userRepository.save(admin);
	}


	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	
	
	
	@Override
	public void delete(int id) {
		userRepository.delete(id);
		
	}

	@Override
	public User findOne(int id) {
		return userRepository.findOne(id);
	}
	
	@Override
	public int createNewUser() {
		return userRepository.saveAndFlush(new User()).getId();
	}

	@Override
	@Transactional
	public void addToShoppingCart(int userId, int modelId) {
		User user = userRepository.findOne(userId);
		ShopingCart cart = user.getShopingCart();
		if(cart==null){
			cart = shopingCartRepository.save(new ShopingCart());
			user.setShopingCart(cart);
		}
		Model model = typeRepository.findOne(modelId);
		cart.add(model);
	}
	
	@Override
	@Transactional
	public void removeToShoppingCart(int userId, int modelId) {
		User user = userRepository.findOne(userId);
		ShopingCart cart = user.getShopingCart();
		Model model = typeRepository.findOne(modelId);
		cart.remove(model);
	}
	
	@Override
	@Transactional
	public void removeAllToShoppingCart(int userId) {
		User user = userRepository.findOne(userId);
		ShopingCart cart = user.getShopingCart();
		if(cart==null)return;
		List<Model> model = typeRepository.findAll();
		cart.removeAll(model);
	}
	
	@Override
	@Transactional
	public void addToCompare(int userId, int modelId) {
		User user = userRepository.findOne(userId);
		Compare compare = user.getCompare();
		if(compare==null){
			compare = compareRepository.save(new Compare());
			user.setCompare(compare);
		}
		Model model = typeRepository.findOne(modelId);
		compare.add(model);
	}
	
	@Override
	@Transactional
	public void removeCompare(int userId, int modelId) {
		User user = userRepository.findOne(userId);
		Compare compare = user.getCompare();
		Model model = typeRepository.findOne(modelId);
		compare.remove(model);
	}
	
	@Override
	@Transactional
	public void removeAllCompare(int userId) {
		User user = userRepository.findOne(userId);
		Compare compare = user.getCompare();
		if(compare==null)return;
		List<Model> model = typeRepository.findAll();
		compare.removeAll(model);
	}
	
	
	
	
	
	
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void setEncoder(BCryptPasswordEncoder encoder) {
		this.encoder = encoder;
	}

	public void setShopingCartRepository(ShopingCartRepository shopingCartRepository) {
		this.shopingCartRepository = shopingCartRepository;
	}

	public void setTypeRepository(TypeRepository typeRepository) {
		this.typeRepository = typeRepository;
	}

	


	
}