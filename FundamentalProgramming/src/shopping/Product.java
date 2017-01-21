package shopping;

public class Product {
	
	private String productName ;
	private double price ;
	
	public Product() {
		productName = "";
		price = 0.0;
	}
	
	public Product (String str , double p) {
		this.productName = str;
		this.price = p;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		
		return this.productName +"\t\t"+ this.price;
	}

}
