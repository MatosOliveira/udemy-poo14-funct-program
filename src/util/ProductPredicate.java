/**
 * 
 */
package util;

import java.util.function.Predicate;

import entities.Product;

/**
 * Classe que implementa Predicate
 * 
 * @author Matos - 22.06.2023
 *
 */
public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 1000.0;
	}

}
