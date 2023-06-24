/**
 * 
 */
package util;

import java.util.function.Function;

import entities.Product;

/**
 * Classe que implementa a interface Function
 * 
 * @author Matos - 22.06.2023
 *
 */
public class ProductFunction implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
