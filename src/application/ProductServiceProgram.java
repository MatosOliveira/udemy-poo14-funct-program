/**
 * 
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.ProductService;

/**
 * 
 * @author Matos = 22.06.2023
 *
 */
public class ProductServiceProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> products = new ArrayList<>();
		
		Product prod1 = new Product("TV", 900.0);
		Product prod2 = new Product("Iphone", 1000.0);
		Product prod3 = new Product("Notebook", 1200.0);
		Product prod4 = new Product("Tablet", 400.0);
		
		products.add(prod1);
		products.add(prod2);
		products.add(prod3);
		products.add(prod4);
		
		ProductService ps = new ProductService();
		double sum = ps.filteredSum(products, p -> p.getName().charAt(0) == 'T');
		
		System.out.println("Sum = " + String.format("%.2f", sum));
		
	}

}
