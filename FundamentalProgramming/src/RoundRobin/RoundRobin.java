package RoundRobin;

import java.util.ArrayList;
import java.util.List;

public class RoundRobin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List seller = new ArrayList();
		seller.add("a");
		seller.add("b");
		// seller.add("c");
		List products = new ArrayList();
		products.add("1");
		products.add("2");
		products.add("3");
		products.add("4");
		products.add("5");
		products.add("6");
		products.add("7");

		List SellerProducts = new ArrayList();

		int sellerLength = seller.size();
		int productLength = products.size();
		System.out.println(sellerLength + "<-selleL , prodLength->" + productLength);
		int divide = productLength / sellerLength;
		int mod = productLength % sellerLength;

		for (int sel = 1; sel <= divide; sel++) {
			for (int sCount = 0; sCount < sellerLength; sCount++) {
				// System.out.println("Scount" + sCount);
				if (sel == 1) {
					SellerProducts.add(seller.get(sCount) + "-" + products.get(sCount));
				} else if (sel > 1) {
					int next = sCount + ((sel * sellerLength) - sellerLength);
					// System.out.println(next);
					SellerProducts.add(seller.get(sCount) + "-" + products.get(next));
				}
			}
		}

		// for Remaining
		for (int p = 0
				+ (sellerLength * divide), initCountForSeller = 0; p < productLength; p++, initCountForSeller++) {
			SellerProducts.add(seller.get(initCountForSeller) + "-" + products.get(p));
		}
		System.out.println("Seller : " + seller);
		System.out.println("products : " + products);
		System.out.println("seller product " + SellerProducts);
	}

}
