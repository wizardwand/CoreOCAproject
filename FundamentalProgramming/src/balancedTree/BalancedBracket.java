package balancedTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {

	static Map<String, String> m = new HashMap();

	public static void main(String[] args) {
		// m.put("{", "}");
		// m.put("}", "{");
		// m.put("[", "]");
		// m.put("]", "[");
		// m.put("(", ")");
		// m.put(")", "(");
		//
		//
		// Scanner in = new Scanner(System.in);
		// int t = in.nextInt();
		//
		// for (int a0 = 0; a0 < t; a0++) {
		// String s = in.next();
		// // System.out.println(checkBalanced(s.toCharArray()));
		//
		// System.out.println(stackApproach(s));
		// }
		//
		// in.close();

		approach3();
	}

	public static void approach3() {
		Stack<Character> stack = new Stack<Character>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			for (int k = 0; k < s.length(); k++) {
				if (s.charAt(k) == '{' || s.charAt(k) == '[' || s.charAt(k) == '(') {
					stack.push(s.charAt(k));
				} else if (s.charAt(k) == '}' || s.charAt(k) == ']' || s.charAt(k) == ')') {
					if (!stack.isEmpty()) {
						if ((int) stack.peek().charValue() + 1 == (int) s.charAt(k)
								|| (int) stack.peek().charValue() + 2 == (int) s.charAt(k)) {
							System.out.println("stack.peek().charValue()+1 :" + (stack.peek().charValue() + 1)
									+ "\n(int)s.charAt(k) : " + (int) s.charAt(k));
							stack.pop();
						} else {
							break;
						}
					}
				}
			}
			if (stack.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
				stack.clear();
			}
		}
	}

	public static String stackApproach(String str) {
		if (str.length() % 2 == 0) {
			Stack<String> s = new Stack<>();
			// push character in stack till string is half parsed
			for (int i = 0; i < str.length() / 2; i++) {
				s.push(str.charAt(i) + "");
			}
			//
			for (int i = str.length() / 2; i < str.length(); i++) {
				// pop the character and check if its opposite is present
				String ch = s.pop();
				String op = str.charAt(i) + "";
				String tmp = m.get(ch);
				// Compare the Values here
				if (!op.equals(tmp)) {
					return "NO";
				}
			}
			return "YES";
		} else {
			return "NO";
		}
	}

	public static String checkBalanced(char[] charArray) {
		if (charArray.length % 2 == 0) {
			for (int i = 0; i < charArray.length / 2; i++) {

				String oppStr = m.get(charArray[(charArray.length - 1) - i] + "");
				if (!oppStr.equals(charArray[i] + "")) {
					return "NO";
				}
			}
			return "YES";
		} else {
			return "NO";
		}
	}

}
