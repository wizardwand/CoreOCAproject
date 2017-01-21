package shnux.careercups.org.chapter1;

import java.util.LinkedList;

public class StringCompression {

	public static void main(String[] args) {
		String input = "aaaabbbccdkssshhhaa";
//		String input = "abcdksh";
		StringCompression sc = new StringCompression();
		String compressed = sc.getCompressedString(input);
		if (input.length() > compressed.length()) {
			System.out.println(compressed);
		} else {
			System.out.println(input);
		}
	}

	public String getCompressedString(String input) {
		LinkedList<Character> stack = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			Character currentChar = input.charAt(i);
			if (stack.isEmpty() || stack.peekLast() == currentChar) {
				stack.addLast(currentChar);
			} else {
				char toStr = stack.peekLast();
				int count = 0;
				while (!stack.isEmpty()) {
					count++;
					stack.removeLast();
				}
				// System.out.println(toStr+"<>"+count);
				sb.append(toStr + "" + count);
				stack.addLast(currentChar);
			}
		}
		char toStr = stack.peekLast();
		int count = 0;
		while (!stack.isEmpty()) {
			count++;
			stack.removeLast();
		}
		sb.append(toStr + "" + count);
		// System.out.println(sb);
		return sb.toString();
	}
}
