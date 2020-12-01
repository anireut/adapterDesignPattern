/**
 * This is the shoe class, it implements ShoeListing interface
 * @author aniruthsivakumar
 *
 */
public class Shoe implements ShoeListing {

	private String brand;
	private String name;
	private double cost;
	private String description;

	/**
	 * Shoe constructor that houses brand, name, cost, and description
	 * @param brand
	 * @param name
	 * @param price
	 * @param description
	 */
	public Shoe(String brand, String name, double price, String description) {
		this.brand = brand;
		this.name = name;
		this.cost = price;
		this.description = description;
	}

	/**
	 * To string that prints the shoe and qualities of it
	 */
	public String toString() {
		return "Shoe: " + this.name + "/nBy: " + this.brand + "/nDetails:" + this.description + "/nCost: $" + this.cost
				+ "";
	}

}
