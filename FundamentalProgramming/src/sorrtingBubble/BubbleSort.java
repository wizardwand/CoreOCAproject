package sorrtingBubble;

import java.util.Arrays;

public class BubbleSort {
	private static void printArray(String s, int[] x) {
		System.out.print(s + " Array: ");
		for (int i : x) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void bubbleSort(int[] x) {
		printArray("Initial", x);

		int endPosition = x.length - 1;
		int swapPosition;

		while (endPosition > 0) {
			swapPosition = 0;
			for (int i = 0; i < endPosition; i++) {
				// check if the element in lower index greater than the element
				// in the higher index
				if (x[i] > x[i + 1]) {
					// Swap elements 'i' and 'i + 1':
					int tmp = x[i];
					x[i] = x[i + 1];
					x[i + 1] = tmp;
					swapPosition = i;
					System.out.println(Arrays.toString(x));
				} // end if
				// printArray("Current", x);
			} // end for
			endPosition = swapPosition;
		} // end while

		printArray("Sorted", x);
	} // end bubbleSort

	public static void main(String[] args) {
		//int[] unsorted = { 999, 1, 5, 2, 4, 3, 1, 2, 4, 7, 9, 1, 2, 77, 4, 33, 111, 555, 0, 1 };
		int[] unsorted = { 5,4,3,2,1 };
		bubbleSort(unsorted);
	}
}
