package recursion;

public class PracticeRecursion {

	// f(f(f(x))) x = 20
	// f(a) = 5 + a
	// f(20) = 5 + 20 ;

	// f(f(f(20))) = f(f(25)) --

	// f(25) = f(25 + 5) - f(30)

	// f(f(f(20))) --- f(f(25)) -- f(30) - 35

	// 5+4+3+2+1 , 4+3+2+1 , 3+2+1 , 2+1 , 1

	public static int summation(int n) {
		// Base CAse : we are at the end
		if (n <= 0) {
			return 0;// additive identity property
		}
		// Recursive case
		else {
			// 3 + summation(2)
			// 3 + 2 + summation(1)
			// 3 + 2 + 1 + summation(0)
			// 3 + 2 + 1 + 0
			return n + summation(n - 1);
		}
	}

	// 5! = 5 * 4 * 3 * 2 * 1 == 120
	public static int factorial(int n) {

		// Base CAse
		if (n <= 1) {
			return 1;
		}
		// Recursive Case
		else {

			// 4!
			// 4 * factorial(3)
			// 4 * 3 * factorial(2)
			// 4 * 3 * 2 * factorial(1)
			// 4 * 3 * 2 * 1
			return n * factorial(n - 1);
		}
	}

	// 5^3 = 5 * 5* 5
	// 5^3 = 5 * 5^2 == 5 * 5 * 5^1 == 5 * 5 * 5
	public static int exponential(int n, int p) {
		// Base Case
		if (p <= 0) {// multiplicative identity
			return 1;
		}
		// Recursive CAse
		else {
			// Exponential(5 , 3)
			// 5 * Exponential(5, 2)
			// 5 * 5 * Exponential(5, 1)
			// 5 * 5 * 5 * Exponential(5 , 0)
			// 5 * 5 * 5 * 1

			return n * exponential(n, p - 1);
		}

	}

	public static void main(String[] args) {
		int num = 3;
		System.out.println("Summation of number " + num + " is :" + summation(num));
		System.out.println("Factorial of number " + (num + 2) + " is :" + factorial(num + 2));
		System.out.println("exponential of number " + (num ) + " is :" + exponential(num , 5));
		
	}

}
