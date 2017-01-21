package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SuperReducedString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		// System.out.println(str);
		StringBuilder sb = new StringBuilder(str);
		// approach1(sb);
		// app2(str);
		app3(str);
	}

	public static void app3(String str) {
		StringBuilder sb = new StringBuilder(str);
		boolean[] index = new boolean[str.length()];
		int i = 0;
		while (i < str.length() - 1 ) {
			
			if (str.charAt(i) == str.charAt(i + 1)) {
				index[i] = true;
				index[i+1] = true;
				// aaabccddd
				i+=2;
			}else{
				index[i] = false;
				i+=1;
			}
		}
		

		//System.out.println(Arrays.toString(index));

		for (int k = str.length() - 1; k > -1; k--) {
			if (true == index[k]) {
				sb.deleteCharAt(k);
			}
		}

		if (sb.length() > 0) {
			System.out.println(sb);
		} else {
			System.out.println("Empty String");
		}
	}

	public static void app2(String str) {
		createMap(str);
	}

	public static void createMap(String str) {
		StringBuffer sb = new StringBuffer(str);
		Map<String, Integer> m = new HashMap<>();
		for (char c : str.toCharArray()) {
			if (m.containsKey(c + "")) {
				int i = m.get(c + "");
				m.put(c + "", i + 1);
			} else {
				m.put(c + "", 1);
			}
		}

		Set<String> set = m.keySet();
		Iterator i = set.iterator();
		while (i.hasNext()) {
			String key = (String) i.next();
			Integer iTmp = m.get(key);
			if (iTmp % 2 != 0) {
				for (int k = 0; k < iTmp - 1; k++) {
					int s1 = sb.indexOf(key);
					sb.deleteCharAt(s1);
				}
			} else if (iTmp == 2) {
				for (int k = 0; k < iTmp; k++) {
					int s1 = sb.indexOf(key);
					sb.deleteCharAt(s1);
				}
			}
		}
		// System.out.println(m);
		if (sb.length() > 0) {
			System.out.println(sb);
		} else {
			System.out.println("Empty String");
		}
	}

	private static void approach1(StringBuilder sb) {
		try {
			for (int i = 0; i < sb.length(); i++) {
				char c1 = sb.charAt(i);
				char c2 = sb.charAt(i + 1);
				if (c1 == c2) {
					sb = sb.deleteCharAt(i);
					sb = sb.deleteCharAt(i + 1);
					// System.out.println(sb);
				}
			}

			// System.out.println(sb);
		} catch (Exception e) {
			// aaabccddd
			System.out.println(sb);

		}

	}

}
