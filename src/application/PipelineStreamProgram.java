/**
 * 
 */
package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Matos
 *
 */
public class PipelineStreamProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 4, 5, 7, 9, 10);

		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));

		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum = " + sum);

		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors.toList());

		System.out.println(Arrays.toString(newList.toArray()));
	}

}
