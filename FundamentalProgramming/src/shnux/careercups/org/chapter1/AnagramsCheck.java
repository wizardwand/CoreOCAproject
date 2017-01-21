package shnux.careercups.org.chapter1;

import java.util.Arrays;

public class AnagramsCheck {

	public static void main(String[] args) {
		AnagramsCheck ac = new AnagramsCheck();
		boolean isIt = ac.isAnagramNormal("Shirish", "iirsshh");
		System.out.println("Are they anagram ? " + (isIt == true ? "YES" : "NO"));
	}

	/**
	 * first check if both the string are of same size then sort the string if
	 * both index elements are same then return true
	 * 
	 * @param s1
	 *            String
	 * @param s2
	 *            String
	 * @return boolean
	 */
	public boolean isAnagramNormal(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		boolean isAnagram = true;
		if (s1.length() == s2.length()) {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);

			for(int i = 0 ; i < c1.length ; i++){
				if(c1[i] == c2[i]){
					continue;
				}else{
					return false;
				}
			}
		}else {
			return false;
		}
		return isAnagram;
	}
}
