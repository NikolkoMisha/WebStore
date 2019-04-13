package project.specification;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import project.dto.filter.CategoryFilter;
import project.entity.Category;

public class CategorySpecification implements Specification<Category> {

	private final CategoryFilter filter;
	
	private final List<Predicate> predicates = new ArrayList<>();
	
	public CategorySpecification(CategoryFilter filter) {
		this.filter = filter;
	}

	private void filterByCommodity(Root<Category> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		if(!filter.getCommodityIds().isEmpty()){
			predicates.add(root.get("commodity").in(filter.getCommodityIds()));
		}
	}
	
	private void fetch(Root<Category> root, CriteriaQuery<?> query){
		if(query.getResultType()!=Long.class){
			root.fetch("commodity", JoinType.LEFT);
		}
	}

	@Override
	public Predicate toPredicate(Root<Category> root, CriteriaQuery<?> query,CriteriaBuilder cb) {
		fetch(root, query);
		query.distinct(true);
		filterByCommodity(root, query, cb);
		if(predicates.isEmpty())return null;
		Predicate[] array = new Predicate[predicates.size()];
		predicates.toArray(array);
		return cb.and(array);
	}

	
	
}
