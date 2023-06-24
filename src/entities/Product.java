/**
 * 
 */
package entities;

/**
 * Classe que contem as informacoes do produto
 * 
 * @author Matos - 21.06.2023
 *
 */
public class Product {

	private String name;
	private Double price;
	
	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 1000.0;
	}
	
	public boolean noStaticProductPredicate() {
		return price >= 1000.0;
	}
	
	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	public void noStaticPriceUpdate() {
		price *= 1.1;
	}
	
	public static String staticUpperCaseName (Product p) {
		return p.getName().toUpperCase();
	}
	
	public String noStaticUpperCaseName() {
		return name.toUpperCase();
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
	
}
