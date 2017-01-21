package practice;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashT {
	static Hashtable<String, Integer[]> ht = new Hashtable<>();

	public static void main(String[] args) {

		Integer[] i = { 5, 1, 2, 3, 4 };

		String input = "Shirish";
		getHTCreated(input.toCharArray());
		/*
1 2 3
1 2 3
1 2 3
		 */
		// ht.put("A", i);
		// System.out.println(ht);
		Set s = ht.keySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			String str = (String) itr.next();
			Integer[] iA = ht.get(str);
			for (Integer ia : iA) {
				System.out.print("\t : " + ia);
			}
		}
	}

	private static void getHTCreated(char[] cs) {
		for (int c = 0; c < cs.length; c++) {
			int[] i = new int[10];
			char ch = cs[c];
			for (int j = c + 1; j < cs.length; j++) {
				if (cs[c] == cs[j]) {
					i[j] = c;
					System.out.println(c + " HI " + ch);
				}
			}
		}
	}

}
