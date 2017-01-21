package exception;

public class MyException {

	public static void main(String[] args) throws Exception {
		MyException m = new MyException();
		try{int a = m.power(3, -5);
		System.out.println(a);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

	public int power(int n, int p) throws Exception {
			if (n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
			}
		return (int) Math.pow(n, p);
	}

}
//class Exp extends Exception{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	
//	@Override
//	public String toString() {
//		return "n and p should be non-negative";
//	}
//	
//}