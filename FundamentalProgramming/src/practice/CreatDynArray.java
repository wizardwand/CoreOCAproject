package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreatDynArray {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner s = new Scanner(System.in);
		List<Integer> nux = new ArrayList();
		int ct = s.nextInt();
		for (int j = 0; j < ct; j++) {
			int sz = s.nextInt();
			for (int sh = 0; sh < sz; sh++) {
				nux.add(s.nextInt());
			}
			
			String ram = "NO";
			for (int sh = 1; sh < nux.size() -1 ; sh++) {
				if (getCenter(nux, sh)) {
					ram = "YES";
					System.out.println(ram);
				}
			}
			if ("NO".equals(ram)) {
				System.out.println(ram);
			}
			nux.removeAll(nux);
		}
		s.close();
	}

	@SuppressWarnings("unchecked")
	private static boolean getCenter(List<Integer> aa, int i) {
		Object[] a = aa.toArray();
		int sL = 0, sR = 0;
		for (int j = 0; j < i; j++) {
			sL += (Integer) a[j];
		}
		for (int j = a.length - 1; j > i; j--) {
			sR += (Integer) a[j];
		}
		if ((sL == sR) && (sL == (Integer) a[i])) {
			return true;
		} else {
			return false;
		}
	}

}
