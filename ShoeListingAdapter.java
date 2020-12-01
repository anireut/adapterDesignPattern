/**
 * Shoe Listing Adapter class that implements product listing in
 * @author aniruthsivakumar
 *
 */
public class ShoeListingAdapter implements ProductListing{
	private ShoeListing shoe;
	private String title;
	private String brand;
	private double price;
	private String description;
	
	/**
	 * ShoeListingAdapter method passes in shoe
	 * @param shoe
	 */
	public ShoeListingAdapter(ShoeListing shoe) {
		this.shoe = shoe;
	}

	public String getTitle() {
		return this.title;

	}

	public double getPrice() {
		return this.price;

	}

	public String getDescription() {
		return "Created by " + this.brand + this.description;

	}

}
