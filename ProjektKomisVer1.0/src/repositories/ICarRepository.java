package repositories;

import domain.*;

public interface ICarRepository extends IRepository<Car> {
	
	/* Wyszukuje samochody po ofercie, a przeciążona metoda 
	 * po ID oferty
	 */

	public Car byOfferId(int offerId);
}
