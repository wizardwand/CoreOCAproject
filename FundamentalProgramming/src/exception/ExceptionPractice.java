package exception;

public class ExceptionPractice {
	public static void main(String[] args) {

		try {
			int[] c = new int[7];
			System.out.println("The element at index 5 is :" + c[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The exception is thrown " + e);
		} finally {
			System.out.println("Completed finally try - catch!");
		}
	}
}
