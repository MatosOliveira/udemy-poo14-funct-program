/**
 * 
 */
package util;

import java.util.function.Consumer;

import entities.Product;

/**
 * Classe que implementa a interface Consumer
 * 
 * @author Matos - 22.06.2023
 *
 */
public class ProductConsumer implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
