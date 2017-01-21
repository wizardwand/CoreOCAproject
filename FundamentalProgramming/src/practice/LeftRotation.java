package practice;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int in = sn.nextInt();
		int[] a1 = new int[in];
		int shift = sn.nextInt();
		for (int i = 0; i < in; i++) {
			a1[i] = sn.nextInt();
		}
		sn.close();
		//System.out.println(Arrays.toString(a1));
		for (int i = 0; i < shift; i++) {
			int tmp = a1[0];
			;
			for (int sh = 0; sh < a1.length - 1; sh++) {
				a1[sh] = a1[sh + 1];
			}
			a1[a1.length - 1] = tmp;
		}
		//System.out.println(Arrays.toString(a1));
		for(int i : a1){
			System.out.print(i+" ");
		}

	}

	private static void shiftAll(int i) {
		// TODO Auto-generated method stub

	}

}
