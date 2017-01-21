package practice;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDarrayNew {

	static int sz = 6;
	static int[][] a;

	public static void main(String[] args) {
		
		readArray();
		printArray();
		//addHourGlass();
		for (int k = 0; k < sz; k++) {
			int sum = 0;
			System.out.println();
			for (int i = 0; i < sz; i++) {
				for (int j = k; j < sz; j++) {
					if (i == j) {
						sum += a[i][j];
						//System.out.print("i==j :"+sum+"\t");
					} else if (i + j == (sz - 1)) {
						sum += a[i][j];
						//System.out.print("i+j :"+sum+"\t");
					}
					if (j == 1 || j == 3 || j == 5) {
						sum += a[i][j];
						//System.out.print("j P :"+sum+"\t");
					}
				}
			}
			System.out.println("Total Sum is K: " + sum);
		}
	}

	private static void addHourGlass() {
		int sum = 0;
		for (int i = 0; i < sz; i++) {
			for (int j = 0; j < sz; j++) {
				if (i == j) {
					sum += a[i][j];
				} else if (i + j == (sz - 1)) {
					sum += a[i][j];
				}
				if (j == 1 || isNotPrime(j)) {
					sum += a[i][j];
				}
			}
		}
		System.out.println("Total Sum is : " + sum);
	}

	private static void printArray() {
		for (int i = 0; i < sz; i++) {
			System.out.println();
			for (int j = 0; j < sz; j++) {
				System.out.print(" " + a[i][j]);
			}
		}
	}

	private static void readArray() {
		Scanner s = new Scanner(System.in);
		a = new int[sz][sz];
		for (int i = 0; i < sz; i++) {
			for (int j = 0; j < sz; j++) {
				if (s.hasNext()) {
					a[i][j] = s.nextInt();
				}
			}
		}
		s.close();
	}

	private static boolean isNotPrime(int j) {
		boolean isPrime = false;
		for (int i = 2; i < j; i++) {
			if (j % i != 0) {
				isPrime = true;
				break;
			}
		}

		return isPrime;
	}

}
