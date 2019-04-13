package project.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="setting")
public class Setting  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="_name")
	private String name;
	@Column(name="_phone")
	private String phone;
	@Column(name="_count")
	private String count;
	

	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="id_model")
	private Model model;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public String getCount() {
		return count;
	}


	public void setCount(String count) {
		this.count = count;
	}

	public Model getModel() {
		return model;
	}


	public void setModel(Model model) {
		this.model = model;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Setting other = (Setting) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	
	
	
}
