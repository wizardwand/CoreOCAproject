package shnux.interview;

import java.util.Scanner;

public class MultiplyDivModOperation {

	public static void main(String[] args) {

		getNumbersForOperation();

		int numrator = (int) (Math.random() * 1000);
		int diviser = (int) (Math.random() * 10);
		System.out.println(numrator + " divided by " + diviser + " = " + divideIntegers(numrator, 5));

	}

	static void getNumbersForOperation() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please input a number");
			int num1 = sc.nextInt();
			System.out.println("Please input a number");
			int num2 = sc.nextInt();
			System.out.println("Multiplucation is " + multiply(num1, num2));
		} catch (Exception e) {
			System.out.println("Please input integers");
			getNumbersForOperation();
		}
	}

	static int multiply(int x, int y) {
		/* Add x one by one */
		if (y > 0)
			return (x + multiply(x, y - 1));

		/* the case where y is negative */
		if (y < 0)
			return -multiply(x, -y);
		/* 0 multiplied with anything gives 0 */
		return 0;
	}

	static int divideIntegers(int num, int den) {
		int sign = (num * den < 0) ? -1 : 1;
		num = Math.abs(num);
		den = Math.abs(den);
		int quo = 0;
		while ((num -= den) >= 0)
			quo++;
		return sign * quo;
	}

}
