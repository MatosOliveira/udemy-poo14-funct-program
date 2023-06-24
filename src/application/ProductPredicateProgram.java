/**
 * 
 */
package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

/**
 * 
 * @author Matos = 22.06.2023
 *
 */
public class ProductPredicateProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		
		Product prod1 = new Product("TV", 900.0);
		Product prod2 = new Product("Iphone", 1000.0);
		Product prod3 = new Product("Notebook", 1200.0);
		Product prod4 = new Product("Tablet", 400.0);
		
		products.add(prod1);
		products.add(prod2);
		products.add(prod3);
		products.add(prod4);
		
		//Remocao produto(s) - formas diversas 
		
		//Interface Predicate
		//products.removeIf(new ProductPredicate());
		
		//Reference method - static
		//products.removeIf(Product::staticProductPredicate);
		
		//Reference method - no static
		//products.removeIf(Product::noStaticProductPredicate);
		
		//Expressao lambda
		//Predicate<Product> pred = p -> p.getPrice() >= 1000.0;
		//products.removeIf(pred);
		
		products.removeIf(p -> p.getPrice() >= 1000.0);
		
		for(Product p: products) {
			System.out.println(p);
		}

	}

}
