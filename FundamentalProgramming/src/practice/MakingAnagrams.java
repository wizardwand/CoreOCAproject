package practice;

import java.util.Scanner;

public class MakingAnagrams {
	Scanner s  = new Scanner(System.in);
	static String s1 , s2 ;
	public static void main(String[] args) {
		MakingAnagrams s = new MakingAnagrams();
		s.readStrings();
		
		int[] a =s.findChar();

		if(-1 != a[0] ){
			System.out.println((s1.length() - 1)+(s2.length() - 1 ) );
		}
	}
	private int[] findChar() {
		int a [] = {-1,-1};
		for(int i = 0 ; i < s1.length() ; i++){
			for(int j = 0 ; j < s2.length() ; j++){
				char c1 = s1.charAt(i) , c2 = s2.charAt(j);
				if(c1 == c2){
					a[0] = i;a[1] = j;
					return a;
				}
			}
		}
		return a ;
	}
	private void readStrings() {
		s1 = s.nextLine();
		s2 = s.nextLine();
	}

}
