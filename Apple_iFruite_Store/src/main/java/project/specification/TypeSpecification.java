package project.specification;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import project.dto.filter.TypeFilter;
import project.entity.Model;

public class TypeSpecification implements Specification<Model> { 
	
	private final TypeFilter filter;
	
	private final List<Predicate> predicates = new ArrayList<>();
	
	public TypeSpecification(TypeFilter filter) {
		this.filter = filter;
	}
	
	private void filterByColor(Root<Model> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		if(!filter.getColorIds().isEmpty()){
			predicates.add(root.get("color").in(filter.getColorIds()));
		}
	}
	
	private void filterByMemory(Root<Model> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		if(!filter.getMemoryIds().isEmpty()){
			predicates.add(root.get("memory").in(filter.getMemoryIds()));
		}
	}
	
	private void filterByCategory(Root<Model> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		if(!filter.getCategoryIds().isEmpty()){
			predicates.add(root.get("category").in(filter.getCategoryIds()));
		}
	}
	
	private void filterByBattery(Root<Model> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		if(!filter.getBatteryIds().isEmpty()){
			predicates.add(root.get("battery").in(filter.getBatteryId()));
		}
	}
	
	private void filterByDiagonal(Root<Model> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		if(!filter.getDiagonalIds().isEmpty()){
			predicates.add(root.get("diagonal").in(filter.getDiagonalId()));
		}
	}
	
	private void filterByOption(Root<Model> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		if(!filter.getKitIds().isEmpty()){
			predicates.add(root.get("kit").in(filter.getKitId()));
		}
	}
	
	private void filterByOS(Root<Model> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		if(!filter.getOperating_systemIds().isEmpty()){
			predicates.add(root.get("operating_system").in(filter.getOperating_systemId()));
		}
	}
	
	private void filterByProcessor(Root<Model> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		if(!filter.getProcessorIds().isEmpty()){
			predicates.add(root.get("processor").in(filter.getProcessorId()));
		}
	}
	
	private void filterByWeight(Root<Model> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		if(!filter.getWeightIds().isEmpty()){
			predicates.add(root.get("weight").in(filter.getWeightId()));
		}
	}
	
	private void filterByRam(Root<Model> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		if(!filter.getRamIds().isEmpty()){
			predicates.add(root.get("ram").in(filter.getRamtId()));
		}
	}
	
	private void filterByRearCamera(Root<Model> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		if(!filter.getRear_cameraIds().isEmpty()){
			predicates.add(root.get("rear_camera").in(filter.getRear_cameraId()));
		}
	}
	
	private void filterByFrontCamera(Root<Model> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		if(!filter.getFront_cameraIds().isEmpty()){
			predicates.add(root.get("front_camera").in(filter.getFront_cameraId()));
		}
	}
	
	private void filterByPrice(Root<Model> root, CriteriaQuery<?> query, CriteriaBuilder cb){
		if(filter.getMax()!=null&&filter.getMin()!=null){
			predicates.add(cb.between(root.get("price"), filter.getMin(), filter.getMax()));
		}else if(filter.getMax()!=null){
			predicates.add(cb.lessThanOrEqualTo(root.get("price"), filter.getMax()));
		}else if(filter.getMin()!=null){
			predicates.add(cb.greaterThanOrEqualTo(root.get("price"), filter.getMin()));
		}
	}
	
	private void filterBySearch(Root<Model> root, CriteriaQuery<?> query, CriteriaBuilder cb){
		if(!filter.getSearch().isEmpty()){
			predicates.add(cb.like(root.get("name"), filter.getSearch()+"%"));
		}
	}

	
	private void fetch(Root<Model> root, CriteriaQuery<?> query){
		if(query.getResultType()!=Long.class){
			root.fetch("memory", JoinType.LEFT);
			root.fetch("color", JoinType.LEFT);
			root.fetch("category", JoinType.LEFT);
			root.fetch("battery", JoinType.LEFT);
			root.fetch("diagonal", JoinType.LEFT);
			root.fetch("kit", JoinType.LEFT);
			root.fetch("operating_system", JoinType.LEFT);
			root.fetch("processor", JoinType.LEFT);
			root.fetch("weight", JoinType.LEFT);
			root.fetch("ram", JoinType.LEFT);
			root.fetch("rear_camera", JoinType.LEFT);
			root.fetch("front_camera", JoinType.LEFT);
		}
	}

	@Override
	public Predicate toPredicate(Root<Model> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		fetch(root, query);
		query.distinct(true);
		filterBySearch(root, query, cb);
		filterByPrice(root, query, cb);
		filterByColor(root, query, cb);
		filterByMemory(root, query, cb);
		filterByCategory(root, query, cb);
		filterByBattery(root, query, cb);
		filterByDiagonal(root, query, cb);
		filterByOption(root, query, cb);
		filterByOS(root, query, cb);
		filterByProcessor(root, query, cb);
		filterByWeight(root, query, cb);
		filterByRam(root, query, cb);
		filterByRearCamera(root, query, cb);
		filterByFrontCamera(root, query, cb);
		if(predicates.isEmpty())return null;
		Predicate[] array = new Predicate[predicates.size()];
		predicates.toArray(array);
		return cb.and(array);
	}

	

	



}
