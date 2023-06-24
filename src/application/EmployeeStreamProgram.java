/**
 * 
 */
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

/**
 * Classe que le os dados (nome, email e salário) de funcionários a partir de um arquivo em formato .csv.
 * 
 * Em seguida mostrar, em ordem alfabética, o email dos funcionários cujo salário seja superior a um dado valor 
 * fornecido pelo usuário. Mostrar também a soma dos salários dos funcionários cujo nome começa com a letra 'M'.
 * 
 * @author Matos -24.06.2023
 *
 */
public class EmployeeStreamProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter file full path: ");
		String path = sc.nextLine();

		System.out.println("Enter salary: ");
		Double salary = sc.nextDouble();

		try(BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Employee> list = new ArrayList<>();
			String line = br.readLine();

			while(line != null) {
				String[] fields = line.split(";");
				Employee employee = new Employee(fields[0], fields[1], Double.parseDouble(fields[2]));
				list.add(employee);
				line = br.readLine();
			}

			List<String> emails = list.stream()
					.filter(p -> p.getSalary() > salary)
					.map(p -> p.getEmail())
					.sorted()
					.collect(Collectors.toList());

			System.out.println("Email of people whose salary is more than " + salary + ": ");
			emails.forEach(System.out::println);


			double sum = list.stream()
					.filter(p -> p.getName().charAt(0) == 'A')
					.map(p -> p.getSalary())
					.reduce(0.0, (x, y) -> x + y);

			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));


		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}


		sc.close();

	}

}
