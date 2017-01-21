package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Anagram {

	static Map m1 = new HashMap<>();
	static Map m2 = new HashMap<>();

	public static void main(String[] args) {
		String s1 = "ABCAAAAA";
		String s2 = "CACAAAAB";
		boolean anagram = true;
		createMap(m1, s1);
		createMap(m2, s2);
		System.out.println("M1 Map\t" + m1);
		System.out.println("M2 Map\t" + m2);
		if (m1.size() != m2.size()) {
			System.out.println("Not Anagram !");
		} else {
			Set se1 = m1.keySet();
			Set se2 = m2.keySet();

			Iterator ii = se1.iterator();
			while (ii.hasNext()) {
				String as = (String) ii.next();
				if (m1.get(as) != m2.get(as)) {
					// System.out.println("Is Not an Anagram !");
					anagram = false;
					break;
				}
			}
			System.out.println("Is an anagram ? :\t " + anagram);
		}

	}

	public static void createMap(Map m, String s) {
		for (int i = 0; i < s.length(); i++) {
			String c = "" + s.charAt(i);
			if (null == m.get(c)) {
				m.put(c, 1);
			} else {
				Integer value = (Integer) m.get(c);
				value += 1;
				m.put(c, value);
			}
		}
	}

}
