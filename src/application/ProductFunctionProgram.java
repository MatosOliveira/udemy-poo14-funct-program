/**
 * 
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;

/**
 * 
 * @author Matos = 22.06.2023
 *
 */
public class ProductFunctionProgram {

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
		
		//Retorna a lista de nomes em maiuscula - diversas formas
		//List<String> names = products.stream().map(new ProductFunction()).collect(Collectors.toList());
		
		//Reference method - static
		//List<String> names = products.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		
		//Reference method - no static
		//List<String> names = products.stream().map(Product::noStaticUpperCaseName).collect(Collectors.toList());
		
		//Expressoes lambdas
		/*
		 * Function<Product, String> func = p -> p.getName().toUpperCase(); 
		 * List<String> names = products.stream().map(func).collect(Collectors.toList());
		 */
		List<String> names = products.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		//Imprime a lista
		names.forEach(System.out::println);

	}

}
