/**
 * Product class implements the Product listing interface
 * 
 * @author aniruthsivakumar
 *
 */
public class Product implements ProductListing {
	private String title;
	private double price;
	private String description;

	/**
	 * Product constructor
	 * 
	 * @param title
	 * @param price
	 * @param description
	 */
	public Product(String title, double price, String description) {
		this.title = title;
		this.price = price;
		this.description = description;
	}
	public String getTitle() {
		return this.title;

	}

	public double getPrice() {
		return this.price;

	}

	public String getDescription() {
		return this.description;

	}
}
