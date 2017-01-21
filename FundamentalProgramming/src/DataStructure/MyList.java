package DataStructure;

import java.util.Arrays;

public class MyList {
	private int size = 5;
	private int top = -1;
	int[] arr = new int[size];

	/*
	 * insert at tail
	 */
	public void insert(int i) {
		if (top > -2 && top < size - 1) {
			top += 1;
			arr[top] = i;
		} else if (top == size - 1) {
			size *= 2;
			top += 1;
			arr = Arrays.copyOf(arr, size);
			arr[top] = i;
		}
	}

	/*
	 * Insert at index
	 */
	public void insert(int index, int value) {
		System.out.println("Top here is : " + top);
		if (index < top && index > -1) {
			int tmp = top;
			while (tmp != index - 1) {
				arr[tmp + 1] = arr[tmp];
				tmp--;

			}
			top++;
			arr[index] = value;
		}else{
			insert(value);
		}

	}
	/*
	 * Remove from Array index
	 */

	public void remove(int index) {

	}

}
