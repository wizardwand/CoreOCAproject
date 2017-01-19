package ds.array;

import java.util.Arrays;

/*
 * This class creates dynamic array
 * As needed by the user
 */

public class DynamicArray implements ArrayAbstractDataType {

	private int[] a;
	private int current;

	public DynamicArray(int size) {
		a = new int[size];
		current = 0;
	}

	@Override
	public void add(int data) {
		if (current == a.length) {
			int[] tmp = new int[a.length * 2];
			a = Arrays.copyOf(a, tmp.length);
		}
		for (int i = 0; i < a.length; i++) {
			if (current == i) {
				a[i] = data;
				current++;
				break;
			}
		}
	}

	@Override
	public boolean modifyAt(int position, int data) {
		if (position < a.length) {
			a[position] = data ;
			return true ;
		}else{
			return false;
		}

	}

	@Override
	public int readFromAPosition(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return the a
	 */
	public int[] getA() {
		return a;
	}
	
	/*
	 * @ takes the the position as an input
	 * return true if element at position is removed 
	 * returns false if the position is not present in the DS 
	 */
	public boolean removeAtPosition(int position){
		if(position < a.length){
			current--;
			for (int i = position; i < a.length; i++) {
				if(i+1 == a.length)break;
				a[i] = a[i+1];
			}
			return true;
		}else{
			return false;
		}
	}

}
