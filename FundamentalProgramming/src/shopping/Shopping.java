package shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shopping {

	private List<Product> shoppingCart = new ArrayList<Product>();
	private List<Product> productShelf = new ArrayList<Product>();

	public static void main(String[] args) {
		Shopping shopping = new Shopping();
		String b = "";
		shopping.addProductsToShelf("Milk", 40.50);
		shopping.addProductsToShelf("Eggs", 45);
		shopping.addProductsToShelf("T-shirt", 90.99);
		shopping.addProductsToShelf("Juice", 5.99);
		shopping.displayProducts(shopping.productShelf);
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to add the products to shelf ?");

		do {
			try {
				b = sc.next();
				if (b.equals("yes")) {
					System.out.println("Give product Name,price");
					String s = sc.next();
					String[] sa = s.split(",");
					shopping.addProductsToShelf(sa[0], Double.parseDouble(sa[1]));
					System.out.println("Do yo want to continue");
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Enter Not Done in format --> Product,Price :(");
			} catch (NumberFormatException e) {
				System.out.println("Entry for price Not done correctly :(");
			}
		} while (b.equals("yes"));
		// ArrayIndexOutOfBoundsException
		// NumberFormatException
		shopping.displayProducts(shopping.productShelf);

		shopping.addToCart("Milk");
		shopping.addToCart("Juice");

		System.out.println("\nThe Shopping list is :");
		shopping.displayProducts(shopping.shoppingCart);

		shopping.calculateTotalPriceOfCart();
	}

	// add products to Shelf
	public void addProductsToShelf(String s, double p) {
		productShelf.add(new Product(s, p));
	}

	// Show products on Shelf
	public void displayProducts(List<Product> s) {
		System.out.println("Product\t\tPrice");
		for (Product p : s) {
			System.out.println(p);
		}
	}

	// add products to cart
	public void addToCart(String pName) {
		for (Product p : productShelf) {
			if (pName.equals(p.getProductName())) {
				shoppingCart.add(p);
			}
		}
	}

	// calculate the total price of Cart
	public void calculateTotalPriceOfCart() {
		double total = 0.0;
		for (Product p : shoppingCart) {
			total += p.getPrice();
		}
		System.out.println("\nThe total price of your shopping is " + total);
	}

}
