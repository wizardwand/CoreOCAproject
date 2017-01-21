package practice;

public class Sherlock {
	static int a[] = { 1, 2, 3, 6, 12, 8 ,4};

	public static void main(String[] args) {
		boolean isCenter = false ;
		int index = 0 ; 
		for (int i = 1; i < (a.length - 2); i++) {
			isCenter = getCenter(i);
			index = i ;
		}
		if(isCenter){
			System.out.println("Yes there is center  i.e : "+a[index]);
		}else{
			System.out.println("No there is center ! ");
		}
	}

	private static boolean getCenter(int i) {
		int sL = 0, sR = 0;
		for (int j = 0; j < i; j++) {
			sL += a[j];
		}
		for (int j = a.length - 1; j > i; j--) {
			sR += a[j];
		}
		if ((sL == sR) && (sL == a[i])) {
			return true;
		} else {
			return false;
		}
	}

}
