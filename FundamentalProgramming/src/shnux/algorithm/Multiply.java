package shnux.algorithm;

public class Multiply {

	public static void main(String[] args) {
		int x = 10;
		int y = 3;
		System.out.println("Multiply is : " + myltiplyWithoutSTARopr(x, y));
	}

	public static int myltiplyWithoutSTARopr(int x, int y) {
		if (y == 0)
			return 0;
		int z = myltiplyWithoutSTARopr(x, Math.abs(y / 2));
		if (Math.abs(y / 2) == 0) {
			return 2 * z;
		} else {
			return x + (2 * z);
		}

	}

}
