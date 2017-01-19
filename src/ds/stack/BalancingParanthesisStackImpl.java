package ds.stack;

public class BalancingParanthesisStackImpl {
	public static void main(String[] args) {
		GenericStackWithLL stack = new GenericStackWithLL();
		// char[] input = "{()[][Shirish is great king][]()}".toCharArray();
		// Case 1
		// char[] input = "".toCharArray();
		// Case 2
		//char[] input = ")(".toCharArray();
		// Case 3
		//char[] input = "[(])".toCharArray();
		// Case 4
		char[] input = "[{()()}]".toCharArray();
				
		String result = "Not Balanced";
		for (int i = 0; i < input.length; i++) {
			char tmp = input[i];
			if (tmp == '[' || tmp == '(' || tmp == '{') {
				stack.push(tmp);
			} else if (tmp == ']') {
				if (!stack.isEmpty()) {
					char lastUnchecked = (char) stack.pop();
					if ('[' == lastUnchecked) {
						result = "Balanced";
						continue;
					} else {
						break;
					}
				}
			} else if (tmp == ')') {
				if (!stack.isEmpty()) {
					char lastUnchecked = (char) stack.pop();
					if ('(' == lastUnchecked) {
						result = "Balanced";
						continue;
					} else {
						break;
					}
				}
			} else if (tmp == '}') {
				char lastUnchecked = (char) stack.pop();
				if ('{' == lastUnchecked) {
					result = "Balanced";
					continue;
				} else {
					break;
				}
			}
		}
		System.out.println("The result is : " + result);
	}
}
