package project.dto.form;

import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import project.entity.Commodity;

public class CategoryForm {

	private int id;
	
	private String name;
	
	private Integer version;
	
	private MultipartFile file;
	
	private Commodity commodity;

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

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public Commodity getCommodity() {
		return commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}
	
	
	
}
