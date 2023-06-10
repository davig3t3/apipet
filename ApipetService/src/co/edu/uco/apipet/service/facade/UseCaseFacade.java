package co.edu.uco.apipet.service.facade;

public interface UseCaseFacade<T> {

	void execute(T dto);
}
