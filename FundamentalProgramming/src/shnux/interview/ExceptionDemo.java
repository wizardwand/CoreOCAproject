package shnux.interview;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			//return;
			System.out.println("try");
			return;
		} finally {
			System.out.println("finally");
		}
	}
}
