/**
 * 
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

/**
 * 
 * @author Matos - 22.06.2023
 *
 */
public class ProductConsumerProgram {

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
		
		//Aumenta o preco em 10% - formas diversas 
		
		//Interface Consumer
		//products.forEach(new ProductConsumer());
		
		//Reference Method - static
		//products.forEach(Product::staticPriceUpdate);
		
		//Reference Method - no static
		//products.forEach(Product::noStaticPriceUpdate);
		
		//Expressao lambda
		double factor = 1.1;
		/*
		 * Consumer<Product> cons = p -> { p.setPrice(p.getPrice() * factor); };
		 * 
		 * products.forEach(cons);
		 */
		
		products.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		//Imprime a lista
		products.forEach(System.out::println);

	}

}
