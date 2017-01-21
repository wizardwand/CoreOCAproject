package practice;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArry {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		int sz = 6;
		int[][] a = new int[sz][sz];
		for (int i = 0; i < sz; i++) {
			for (int j = 0; j < sz; j++) {
				if (s.hasNext()) {
					a[i][j] = s.nextInt();
				}
			}
		}
		s.close();

		for (int i = 0; i < sz; i++) {
			System.out.println();
			for (int j = 0; j < sz; j++) {	
				System.out.print(" " + a[i][j]);
			}
		}
		int sum = 0;
		for (int i = 0; i < sz; i++) {
			for (int j = 0; j < sz; j++) {
				if (i == j) {
					sum += a[i][j];
				} else if (i + j == (sz - 1)) {
					sum += a[i][j];
				}
				if ( j == 1 || isNotPrime(j)) {
					sum += a[i][j];
				}
			}
		}
		System.out.println("Total Sum is : " + sum);
	}

	private static boolean isNotPrime(int j) {
		boolean isPrime = false;
		for(int i =2 ; i < j ; i++ ){
			if(j%i != 0 ){
				 isPrime = true ;
				 break ;
			}
		}
			
		return isPrime;
	}

}
