/**
 * 
 */
package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

/**
 * Classe que recebe uma funcao como parametro
 * 
 * @author Matos - 22.06.2023
 *
 */
public class ProductService {

	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		
		for(Product p: list) {
			if(criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
