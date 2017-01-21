package generic;

public class Generics {

	public static <T extends Comparable<T>> T findMax(T a, T b) {
		int n = a.compareTo(b);
		System.out.println("a: " + a + " b: " + b + " a.compareTo(b) value: " + n);
		if (n < 0) {
			return b;
		} else {
			return a;
		}
	}

	public static void main(String[] args) {
		System.out.println(findMax(2, 3));
		System.out.println(findMax(3, 3));
		System.out.println(findMax(3, 2));

		System.out.println(findMax('c', 'a'));
		System.out.println(findMax("hello", "there"));

		// Generics g = new Generics();
		// System.out.println(g.findMax(2,3));
	}

}
