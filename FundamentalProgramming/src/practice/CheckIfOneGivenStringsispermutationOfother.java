package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CheckIfOneGivenStringsispermutationOfother {
	static Map<Character , Integer> m1 = new HashMap();
	static Map<Character , Integer> m2  = new HashMap();
	static char[][] a1 = new char[10][2];
	static char[][] a2 = new char[10][2];
	public static void main(String[] args) {
		String s1 = "shir" , s2 = "irash";
		createMap(s1,m1);
		createMap(s2,m2);
		System.out.println(m1 + "-------" + m2);
		System.out.println("is S2  permutation of s1 ? "+checkifS2isPofS1());
		System.out.println("is S1  permutation of s2 ? "+checkifS1isPofS2());
		
		//-----------------Approach 2 ----------- Array
		//getArrCreated(s1,s2);
		
	}
	public static void getArrCreated(String s1, String s2) {
		addCharToArr(s1 , a1);
		addCharToArr(s2 , a2);
		printA(a1);
		printA(a2);
	}
	private static void printA(char[][] a) {
		System.out.println("array is :");
		for(int i = 0 ; i < a.length -1 ; i++ ){
			System.out.println(a[i][0] +" ------ "+ a[i][1]);
		}
	}
	public static void addCharToArr(String s, char[][] a) {
		for(int i = 0 ; i < s.length() ; i ++){
			char c = s.charAt(i);
			int ct = 0 ;
			if(!charInArr(c, a)){
				ct = getCount(c , i , s);
				System.out.println(c + " char count : "+ ct);
			}
			a[i][0] = c ;
			a[i][1] = (char) ct;
		}
	}
	private static int getCount(char c, int index , String s) {
		int ct = 0 ;
		for(int i = index ; i < s.length() -1 ; i ++){
			if(c == s.charAt(i)){
				ct++ ;
			}
		}
		return ct;
	}
	private static boolean charInArr(char c, char[][] a) {
		for(int i =0 ; i < a.length -1 ; i ++){
			if(c == a[i][0]){
				return true;
			}
		}
		return false;
		
	}
	public static String checkifS2isPofS1() {
		Set<Character> set = m1.keySet();
		Iterator i = set.iterator();
		String re = " Yes They Are !";
		while(i.hasNext()){
			Character c = (Character) i.next();
			//System.out.println("m1 : "+m1.get(c) +" m2 : "+ m2.get(c));
			if(m1.get(c) != m2.get(c)){
				re = " No They are Not :(";
			}
		}
		return re ;
	}
	public static String checkifS1isPofS2() {
		Set<Character> set = m2.keySet();
		Iterator i = set.iterator();
		String re = " Yes They Are !";
		while(i.hasNext()){
			Character c = (Character) i.next();
			//System.out.println("m1 : "+m1.get(c) +" m2 : "+ m2.get(c));
			if(m1.get(c) != m2.get(c)){
				re = " No They are Not :(";
			}
		}
		return re ;
	}
	public static void createMap(String s1, Map<Character, Integer> m) {
		for(Character c : s1.toCharArray()){
			if(m.containsKey(c)){
				int a = m.get(c) + 1 ;
				m.put(c, a);
			}else{
				m.put(c, 1);
			}
		}
	}

}
