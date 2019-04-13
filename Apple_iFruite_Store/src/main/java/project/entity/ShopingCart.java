package project.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
@Entity
public class ShopingCart {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@OneToMany(mappedBy="shopingCart")
	private List<User> users = new ArrayList<>();
	@ManyToMany
	private List<Model> models = new ArrayList<>();
	@Column(name="_count")
	private int count;
	
	public void add(Model e) {
		models.add(e);
		count = models.size();
	}
	
	public void remove(Model e){
		models.remove(e);
		count = models.size();
	}
	
	public void removeAll(List<Model> model){
		models.removeAll(models);
		count = models.size();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Model> getModels() {
		return models;
	}

	public void setModels(List<Model> models) {
		this.models = models;
	}
	

}
