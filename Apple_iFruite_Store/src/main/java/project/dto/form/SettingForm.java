package project.dto.form;

import project.entity.Model;

public class SettingForm {

	private int id;
	
	private String count;
	
	private String name;
	
	private String phone;
	
	private Model model;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model  model) {
		this.model = model ;
	}

	
	
	
}
