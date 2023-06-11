package co.edu.uco.apipet.service.specification;

public interface Specification<T> {

	void isSatisfied(T data);
}
