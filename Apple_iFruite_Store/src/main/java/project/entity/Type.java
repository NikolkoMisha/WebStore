package project.entity;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//import javax.persistence.Transient;
//
//import org.springframework.web.multipart.MultipartFile;
//
//@Entity
//@Table(name="model")
//public class Type  {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	@Column(name="_name")
//	private String name;
//	@Column(name="_price")
//	private  BigDecimal price;
//	@Column(name="_count")
//	private  BigDecimal count;
//	
//
//	private Integer version;
//	@Transient
//	private MultipartFile file;
//	
//	@ManyToOne(fetch= FetchType.LAZY)
//	@JoinColumn(name="id_category")
//	private Category category;
//	
//	@ManyToOne(fetch= FetchType.LAZY)
//	@JoinColumn(name="id_color")
//	private Color color;
//	
//	@ManyToOne(fetch= FetchType.LAZY)
//	@JoinColumn(name="id_kit")
//	private Option kit;
//	
//	@ManyToOne(fetch= FetchType.LAZY)
//	@JoinColumn(name="id_battery")
//	private Battery battery;
//
//	@ManyToOne(fetch= FetchType.LAZY)
//	@JoinColumn(name="id_processor")
//	private Processor processor;
//
//	@ManyToOne(fetch= FetchType.LAZY)
//	@JoinColumn(name="id_diagonal")
//	private Diagonal diagonal;
//
//	@ManyToOne(fetch= FetchType.LAZY)
//	@JoinColumn(name="id_memory")
//	private Memory memory;
//	
//	@ManyToOne(fetch= FetchType.LAZY)
//	@JoinColumn(name="id_operating_system")
//	private OS operating_system;
//	
//	@ManyToOne(fetch= FetchType.LAZY)
//	@JoinColumn(name="id_weight")
//	private Weight weight;
//	
//	@ManyToMany(mappedBy="typies")
//	private List<ShopingCart> shopingCarts = new ArrayList<>();
//	
//	public List<ShopingCart> getShopingCarts() {
//		return shopingCarts;
//	}
//	public void setShopingCarts(List<ShopingCart> shopingCarts) {
//		this.shopingCarts = shopingCarts;
//	}
//	
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public BigDecimal getPrice() {
//		return price;
//	}
//	
//	public void setPrice(BigDecimal price) {
//		this.price = price;
//	}
//	
//	public BigDecimal getCount() {
//		return count;
//	}
//	public void setCount(BigDecimal count) {
//		this.count = count;
//	}
//	public Battery getBattery() {
//		return battery;
//	}
//
//	public void setBattery(Battery battery) {
//		this.battery = battery;
//	}
//
//	public Option getKit() {
//		return kit;
//	}
//
//	public void setKit(Option kit) {
//		this.kit = kit;
//	}
//
//	public OS getOperating_system() {
//		return operating_system;
//	}
//
//	public void setOperating_system(OS operating_system) {
//		this.operating_system = operating_system;
//	}
//
//	public Category getCategory() {
//		return category;
//	}
//
//
//	public void setCategory(Category category) {
//		this.category = category;
//	}
//
//
//	public Color getColor() {
//		return color;
//	}
//
//
//	public void setColor(Color color) {
//		this.color = color;
//	}
//
//
//	public Memory getMemory() {
//		return memory;
//	}
//
//
//	public void setMemory(Memory memory) {
//		this.memory = memory;
//	}
//
//
//	public Processor getProcessor() {
//		return processor;
//	}
//
//
//	public void setProcessor(Processor processor) {
//		this.processor = processor;
//	}
//
//
//	public Diagonal getDiagonal() {
//		return diagonal;
//	}
//
//
//	public void setDiagonal(Diagonal diagonal) {
//		this.diagonal = diagonal;
//	}
//
//
//	public Weight getWeight() {
//		return weight;
//	}
//
//	public void setWeight(Weight weight) {
//		this.weight = weight;
//	}
//
//
//	
//	public Integer getVersion() {
//		return version;
//	}
//	public void setVersion(Integer version) {
//		this.version = version;
//	}
//	public MultipartFile getFile() {
//		return file;
//	}
//
//	public void setFile(MultipartFile file) {
//		this.file = file;
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Type other = (Type) obj;
//		if (id != other.id)
//			return false;
//		return true;
//	}
//
//	
//
//	
//}