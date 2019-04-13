package project.dto.filter;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TypeFilter {
	
	private static final Pattern PEATTERN = Pattern.compile("[0-9]+");

	private String search = "";
	
	private String maxPrice = "";
	
	private String minPrice = "";
	
	private Integer max;
	
	private Integer min;
	
	private List<Integer> colorIds = new ArrayList<>();
	private List<String> colorId = colorIds.stream().map(Object::toString).collect(Collectors.toList());
	
	private List<Integer> memoryIds = new ArrayList<>();
	private List<String> memoryId = memoryIds.stream().map(Object::toString).collect(Collectors.toList());
	
	private List<Integer> categoryIds = new ArrayList<>();
	private List<String> categoryId = categoryIds.stream().map(Object::toString).collect(Collectors.toList());
	
	private List<Integer> batteryIds = new ArrayList<>();
	private List<String> batteryId = batteryIds.stream().map(Object::toString).collect(Collectors.toList());
	
	private List<Integer> diagonalIds = new ArrayList<>();
	private List<String> diagonalId = diagonalIds.stream().map(Object::toString).collect(Collectors.toList());
	
	private List<Integer> kitIds = new ArrayList<>();
	private List<String> kitId = kitIds.stream().map(Object::toString).collect(Collectors.toList());
	
	private List<Integer> operating_systemIds = new ArrayList<>();
	private List<String> operating_systemId = operating_systemIds.stream().map(Object::toString).collect(Collectors.toList());
	
	private List<Integer> processorIds = new ArrayList<>();
	private List<String> processorId = processorIds.stream().map(Object::toString).collect(Collectors.toList());
	
	private List<Integer> weightIds = new ArrayList<>();
	private List<String> weightId = weightIds.stream().map(Object::toString).collect(Collectors.toList());
	
	private List<Integer> ramIds = new ArrayList<>();
	private List<String> ramtId = ramIds.stream().map(Object::toString).collect(Collectors.toList());
	
	private List<Integer> rear_cameraIds = new ArrayList<>();
	private List<String> rear_cameraId = rear_cameraIds.stream().map(Object::toString).collect(Collectors.toList());
	
	private List<Integer> front_cameraIds = new ArrayList<>();
	private List<String> front_cameraId = front_cameraIds.stream().map(Object::toString).collect(Collectors.toList());

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(String maxPrice) {
		if(PEATTERN.matcher(maxPrice).matches())max = Integer.valueOf(maxPrice);
		this.maxPrice = maxPrice;
	}

	public String getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(String minPrice) {
		if(PEATTERN.matcher(minPrice).matches())min = Integer.valueOf(minPrice);
		this.minPrice = minPrice;
	}


	public List<Integer> getColorIds() {
		return colorIds;
	}

	public void setColorIds(List<Integer> colorIds) {
		this.colorIds = colorIds;
	}

	public List<Integer> getMemoryIds() {
		return memoryIds;
	}

	public void setMemoryIds(List<Integer> memoryIds) {
		this.memoryIds = memoryIds;
	}

	public List<String> getColorId() {
		return colorId;
	}

	public void setColorId(List<String> colorId) {
		this.colorId = colorId;
	}

	public List<String> getMemoryId() {
		return memoryId;
	}

	public void setMemoryId(List<String> memoryId) {
		this.memoryId = memoryId;
	}

	public List<Integer> getCategoryIds() {
		return categoryIds;
	}

	public void setCategoryIds(List<Integer> categoryIds) {
		this.categoryIds = categoryIds;
	}

	public List<String> getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(List<String> categoryId) {
		this.categoryId = categoryId;
	}

	public List<Integer> getBatteryIds() {
		return batteryIds;
	}

	public void setBatteryIds(List<Integer> batteryIds) {
		this.batteryIds = batteryIds;
	}

	public List<String> getBatteryId() {
		return batteryId;
	}

	public void setBatteryId(List<String> batteryId) {
		this.batteryId = batteryId;
	}

	public List<Integer> getDiagonalIds() {
		return diagonalIds;
	}

	public void setDiagonalIds(List<Integer> diagonalIds) {
		this.diagonalIds = diagonalIds;
	}

	public List<String> getDiagonalId() {
		return diagonalId;
	}

	public void setDiagonalId(List<String> diagonalId) {
		this.diagonalId = diagonalId;
	}

	public List<Integer> getKitIds() {
		return kitIds;
	}

	public void setKitIds(List<Integer> kitIds) {
		this.kitIds = kitIds;
	}

	public List<String> getKitId() {
		return kitId;
	}

	public void setKitId(List<String> kitId) {
		this.kitId = kitId;
	}

	public List<Integer> getOperating_systemIds() {
		return operating_systemIds;
	}

	public void setOperating_systemIds(List<Integer> operating_systemIds) {
		this.operating_systemIds = operating_systemIds;
	}

	public List<String> getOperating_systemId() {
		return operating_systemId;
	}

	public void setOperating_systemId(List<String> operating_systemId) {
		this.operating_systemId = operating_systemId;
	}

	public List<Integer> getProcessorIds() {
		return processorIds;
	}

	public void setProcessorIds(List<Integer> processorIds) {
		this.processorIds = processorIds;
	}

	public List<String> getProcessorId() {
		return processorId;
	}

	public void setProcessorId(List<String> processorId) {
		this.processorId = processorId;
	}

	public List<Integer> getWeightIds() {
		return weightIds;
	}

	public void setWeightIds(List<Integer> weightIds) {
		this.weightIds = weightIds;
	}

	public List<String> getWeightId() {
		return weightId;
	}

	public void setWeightId(List<String> weightId) {
		this.weightId = weightId;
	}

	public List<Integer> getRamIds() {
		return ramIds;
	}

	public void setRamIds(List<Integer> ramIds) {
		this.ramIds = ramIds;
	}

	public List<String> getRamtId() {
		return ramtId;
	}

	public void setRamtId(List<String> ramtId) {
		this.ramtId = ramtId;
	}

	public List<Integer> getRear_cameraIds() {
		return rear_cameraIds;
	}

	public void setRear_cameraIds(List<Integer> rear_cameraIds) {
		this.rear_cameraIds = rear_cameraIds;
	}

	public List<String> getRear_cameraId() {
		return rear_cameraId;
	}

	public void setRear_cameraId(List<String> rear_cameraId) {
		this.rear_cameraId = rear_cameraId;
	}

	public List<Integer> getFront_cameraIds() {
		return front_cameraIds;
	}

	public void setFront_cameraIds(List<Integer> front_cameraIds) {
		this.front_cameraIds = front_cameraIds;
	}

	public List<String> getFront_cameraId() {
		return front_cameraId;
	}

	public void setFront_cameraId(List<String> front_cameraId) {
		this.front_cameraId = front_cameraId;
	}

	

	
	
}
