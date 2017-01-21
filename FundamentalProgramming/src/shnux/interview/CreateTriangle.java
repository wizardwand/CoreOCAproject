package shnux.interview;

public class CreateTriangle {

	/*public static void main(String[] args) {
		CreateTriangle c = new CreateTriangle();
		c.createUphalfTriangle();
		c.createBottomHalfTriangle();
	}
*/
	public void createUphalfTriangle() {
		int numberOfStar = 10;
		for (int i = 1; i < numberOfStar; i += 2) {
			for (int k = 0; k < (((numberOfStar/2) -1) - i / 2); k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public void createBottomHalfTriangle() {
		int numberOfStar = 10;
		for (int i = numberOfStar-1; i >= 1; i -= 2) {
			for (int k = 0; k < (((numberOfStar/2) -1) - i / 2); k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
