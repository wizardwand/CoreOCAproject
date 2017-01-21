package aPUZZILERS;

public class Oddity {

	public static void main(String[] args) {
		System.out.println(Oddity.isOdd(11));
		System.out.println(Oddity.isOdd(-11));
		System.out.println(Oddity.isOdd(0));
		
		System.out.println(Oddity.isOddV2(11));
		System.out.println(Oddity.isOddV2(-11));
		System.out.println(Oddity.isOddV2(0));
		
		for (int i = 0 ; i < 20 ; i ++ ){
			System.out.println( i+" & 1: "+(i & 1) );
		}
	}
	public static boolean isOdd(int i) {
	    return i % 2 == 1;
	}
	public static boolean isOddV2(int i ){
		return i % 2 != 0 ;
	}
	
}
