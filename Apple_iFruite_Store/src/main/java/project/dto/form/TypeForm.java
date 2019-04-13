package project.dto.form;



import org.springframework.web.multipart.MultipartFile;

import project.entity.Battery;
import project.entity.Category;
import project.entity.Color;
import project.entity.Diagonal;
import project.entity.FrontCamera;
import project.entity.Memory;
import project.entity.OS;
import project.entity.Option;
import project.entity.Processor;
import project.entity.Ram;
import project.entity.RearCamera;
import project.entity.Weight;

public class TypeForm {
	
	private int id;
	
	private String name;
	
	private String price;
	
	private Color color;
	
	private Memory memory;
	
	private Category category;
	
	private Processor processor;
	
	private Diagonal diagonal;
	
	private Weight weight;
	
	private Option kit;
	
	private Battery battery;
	
	private OS operating_system;
	
	private Ram ram;
	
	private RearCamera rear_camera;
	
	private FrontCamera front_camera;
	
	private Integer version;
	
	
	
	private MultipartFile file;
	
	
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public Diagonal getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(Diagonal diagonal) {
		this.diagonal = diagonal;
	}

	public Weight getWeight() {
		return weight;
	}

	public void setWeight(Weight weight) {
		this.weight = weight;
	}

	public Option getKit() {
		return kit;
	}

	public void setKit(Option kit) {
		this.kit = kit;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public OS getOperating_system() {
		return operating_system;
	}

	public void setOperating_system(OS operating_system) {
		this.operating_system = operating_system;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public RearCamera getRear_camera() {
		return rear_camera;
	}

	public void setRear_camera(RearCamera rear_camera) {
		this.rear_camera = rear_camera;
	}

	public FrontCamera getFront_camera() {
		return front_camera;
	}

	public void setFront_camera(FrontCamera front_camera) {
		this.front_camera = front_camera;
	}


	
}
