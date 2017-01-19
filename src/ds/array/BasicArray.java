package ds.array;

public class BasicArray implements ArrayAbstractDataType {

	private int[] a;
	private int current;

	public BasicArray(int size) {
		a = new int[size];
		current = 0;
	}

	@Override
	public void add(int data) {
		for (int i = 0; i < a.length - 1; i++) {
			if (current == i) {
				a[i] = data;
				current++;
				break;
			}
		}

	}

	/**
	 * @return modifies the element at Position in an Array
	 */
	@Override
	public boolean modifyAt(int position, int data) {
		if (position <= current) {
			a[position] = data;
			return true;
		} else {
			return false;
		}

	}

	/**
	 * @return the element at Position in an Array
	 */
	@Override
	public int readFromAPosition(int position) {
		if (position <= current) {
			return a[position - 1];
		}
		return 0;

	}

	/**
	 * @return the Array
	 */
	public int[] getA() {
		return a;
	}

}
