package unitofwork;

import domain.Entity;

public interface IUnitOfWorkRepository {
		
		// Metody ustawiające odpowiednie zapytanie dla operacji Insert, Update oraz Delete
	public void persistAdd(Entity entity);
	public void persistUpdate(Entity entity);
	public void persistDelete(Entity entity);
	
	
}
