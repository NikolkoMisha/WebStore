package project.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="model")
public class Model {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="_name")
	private String name;
	@Column(name="_price")
	private  BigDecimal price;
	
	
	
	private Integer version;
	@Transient
	private MultipartFile file;
	

	@ManyToMany(cascade = {CascadeType.ALL}, mappedBy="models")
	private List<ShopingCart> shopingCarts = new ArrayList<>();
	
	@ManyToMany(cascade = {CascadeType.ALL}, mappedBy="models")
	private List<Compare> compares = new ArrayList<>();
	
	@OneToMany(mappedBy="model")
	private List<Setting> settings = new ArrayList<>();
	
	@Column(name="_count")
	private Integer counter = 1;

	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="id_color")
	private Color color;

	@ManyToOne(fetch= FetchType.EAGER)
	@JoinColumn(name="id_battery")
	private Battery battery;
	
	@ManyToOne(fetch= FetchType.EAGER)
	@JoinColumn(name="id_category")
	private Category category;
	
	@ManyToOne(fetch= FetchType.EAGER)
	@JoinColumn(name="id_diagonal")
	private Diagonal diagonal;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="id_memory")
	private Memory memory;
	
	@ManyToOne(fetch= FetchType.EAGER)
	@JoinColumn(name="id_option")
	private Option kit;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="id_operating_system")
	private OS operating_system;
	
	@ManyToOne(fetch= FetchType.EAGER)
	@JoinColumn(name="id_processor")
	private Processor processor;
	
	@ManyToOne(fetch= FetchType.EAGER)
	@JoinColumn(name="id_weight")
	private Weight weight;
	
	@ManyToOne(fetch= FetchType.EAGER)
	@JoinColumn(name="id_ram")
	private Ram ram;
	
	@ManyToOne(fetch= FetchType.EAGER)
	@JoinColumn(name="id_front_camera")
	private FrontCamera front_camera;
	
	@ManyToOne(fetch= FetchType.EAGER)
	@JoinColumn(name="id_rear_camera")
	private RearCamera rear_camera;


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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public Diagonal getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(Diagonal diagonal) {
		this.diagonal = diagonal;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

	public Option getKit() {
		return kit;
	}

	public void setKit(Option kit) {
		this.kit = kit;
	}

	public OS getOperating_system() {
		return operating_system;
	}

	public void setOperating_system(OS operating_system) {
		this.operating_system = operating_system;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public Weight getWeight() {
		return weight;
	}

	public void setWeight(Weight weight) {
		this.weight = weight;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public FrontCamera getFront_camera() {
		return front_camera;
	}

	public void setFront_camera(FrontCamera front_camera) {
		this.front_camera = front_camera;
	}

	public RearCamera getRear_camera() {
		return rear_camera;
	}

	public void setRear_camera(RearCamera rear_camera) {
		this.rear_camera = rear_camera;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<ShopingCart> getShopingCarts() {
		return shopingCarts;
	}

	public void setShopingCarts(List<ShopingCart> shopingCarts) {
		this.shopingCarts = shopingCarts;
	}

	public List<Compare> getCompare() {
		return compares;
	}

	public void setCompare(List<Compare> compares) {
		this.compares = compares;
	}

	public List<Setting> getSettings() {
		return settings;
	}

	public void setSettings(List<Setting> settings) {
		this.settings = settings;
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

	public Integer getCounter() {
		return counter;
	}

	public void setCounter(Integer counter) {
		this.counter = counter;
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
		Model other = (Model) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	
}
