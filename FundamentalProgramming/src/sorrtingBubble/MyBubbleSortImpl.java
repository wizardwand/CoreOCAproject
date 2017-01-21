package sorrtingBubble;

import java.util.Arrays;
import java.util.Scanner;

public class MyBubbleSortImpl {

	public static void main(String[] args) {
		// get the values
		Scanner sc = new Scanner(System.in);
		int sizeA = sc.nextInt();
		// create an array
		int[] arr = new int[sizeA];
		// int[] arr = {3 , 2 , 1};

		// initilize array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// create swap count , initial ,
		int swipeCount = 0, loopCount = arr.length - 1;

		// before sorting
		System.out.println("Initial Array" + Arrays.toString(arr));
		// sort the array
		while (loopCount > 0) {
			for (int i = 0; i < loopCount; i++) {
				if (arr[i] > arr[i + 1]) {
					int t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;
					System.out.println("after Swip " + Arrays.toString(arr));
					swipeCount++;
				}
			}
			loopCount--;
		}
		System.out.println("Final Array :" + Arrays.toString(arr));
		// print the swap count
		System.out.println("Array is sorted in " + swipeCount + " swaps.");

		// print the first element
		System.out.println("First Element: " + arr[0]);

		// print the last element
		System.out.println("Last Element: " + arr[sizeA - 1]);
	}

}
