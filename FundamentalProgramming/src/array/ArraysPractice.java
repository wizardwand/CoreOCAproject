package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysPractice {

	public static void main(String[] args) {

		// index 0 1 2 3
		// array 10 5 3 6 - size is : 4

		// index 0 1 2
		// "Shirish" "ramesh" "Tieto" - size is 3

		// declare an array

		int[] a1 = new int[1];
		int[] a2 = { 10, 5, 3, 6 };

		String shopingList[] = { "Rice", "Eggs", "Milk" };
		
		//pick random for array of shopping 
		int rad = (int)(Math.abs( Math.random()*10) % 3 );
		
		System.out.println("Random : - "+ rad + " and random value is : "+shopingList[rad]);

		// print the array
		System.out.println(Arrays.toString(a2));

		a1[0] = 100;
		// custom Print
		print(a2);
		
		//Sort 
		Arrays.sort(a2);
		System.out.println();
		print(a2);
		
		String s = "shnux";
		String tmp =""+ s.charAt(0) ;
		System.out.println(tmp.toUpperCase()+ s.substring(1, s.length()));
		
		String input = "Welcome Java";
		int len = 3 ;
		
		System.out.println(input.substring(input.length() - (len) ,input.length()));
        System.out.println(input.substring(0,len));

        printArray(shopingList);
	}

	public static void print(int[] a1) {
		System.out.print("[");
		for (int i = 0; i < a1.length; i++) {
			if (i < a1.length - 1) {
				System.out.print(a1[i] + ", ");
			} else {
				System.out.println(a1[i] + "]");
			}
		}
	}
	
	public static <E> void printArray(E[] aarray) {
		System.out.print("[");
		for(E element : aarray){
			System.out.print(element+", ");
		}
		System.out.println("]");
	}

}
