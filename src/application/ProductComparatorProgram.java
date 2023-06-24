/**
 * 
 */
package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

/**
 * Testa a implementacao da interface Comparator com expressoes lambdas.
 * 
 * @author Matos = 22.06.2023
 *
 */
public class ProductComparatorProgram {

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
		
		//Expressao lambda - funcao anonima
		Comparator<Product> prodComp = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		products.sort(prodComp);
		
		/*
		 * Comparator<Product> prodComp = (p1,p2) -> { return
		 * p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); };
		 */
		
		//products.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for(Product p: products) {
			System.out.println(p);
		}

	}

}
