/**
 * 
 */
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

/**
 * Classe que le um conjunto de produtos a partir de um arquivo em formato .csv (suponha que exista pelo menos um produto).
 * 
 * Em seguida mostrar o preço médio dos produtos. Depois, mostrar os nomes, em ordem decrescente, dos produtos que possuem 
 * preço inferior ao preço médio.
 * 
 * @author Matos - 23.06.2023
 *
 */
public class ProductStreamProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter file full path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Product> list = new ArrayList<>();
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(";");
				Product product = new Product(fields[0], Double.parseDouble(fields[1]));
				list.add(product);
				line = br.readLine();
			}
			
			//Calcula a media
			double media = list.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x, y) -> x + y) / list.size();
			
			System.out.println("Average price: " + String.format("%.2f", media));
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			//Obtem os produtos com preco menor que a media e imprime em ordem decrescente
			List<String> names = list.stream()
					.filter(p -> p.getPrice() < media)
					.map(p -> p.getName())
					.sorted(comp.reversed())
					.collect(Collectors.toList());
			
			names.forEach(System.out::println);
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		sc.close();

	}


}
