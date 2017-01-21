package shnux.careercups.org.chapter1;

import java.util.HashSet;
import java.util.Set;

/*
 * Implement an algorithm to determine if a string has all unique characters. 
What if you
can not use additional data structures

My algorithm : generate a hashSet, check if all the elements are present.

Time Complexity : Order N  


Solution 2 : INDEX OF  algo used : 

Complexicity : O(n)

 */
public class AllCharacterAtoZpresentCheck {
	static char[] orgArr = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

	// Check if only vowels are present [a,e,i,o,u]

	public static void main(String[] args) {
		String in = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!!!@@@$$$$";

		/*
		 * Solution 1 , with Hashset
		 */
		Set set = generaterSet(in.toUpperCase());
		System.out.println("Is Sentence- " + in + " -containg all unique character ? :  " + checkIfUnique(set));

		/*
		 * Solution 2 compare the whole string USING INDEX OF
		 * 
		 */
		boolean result = compareWholestring(in);

		System.out.println("Used String function : contains all chars ? : " + result);

	}

	private static boolean compareWholestring(String in) {
		for (int i = 0; i < orgArr.length - 1; i++) {
			//issue here is of upper case and lower case 
			// Would have to convert the given string in to UPPERcase so the program
			//doesn't fail 
			if (-1 == in.indexOf(orgArr[i] + "")) {
				return false;
			}
		}
		return true;
	}

	private static Set generaterSet(String in) {
		char[] ch = in.toCharArray();
		HashSet hSet = new HashSet<Character>();
		for (char c : ch) {
			hSet.add(c);
		}
		return hSet;
	}

	private static boolean checkIfUnique(Set set) {
		for (char c : AllCharacterAtoZpresentCheck.orgArr) {
			if (!set.contains(c)) {
				return false;
			}
		}
		return true;
	}
}