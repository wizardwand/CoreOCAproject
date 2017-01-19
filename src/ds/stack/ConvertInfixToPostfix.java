package ds.stack;

import java.util.LinkedList;
import java.util.List;

public class ConvertInfixToPostfix {
	public static void main(String[] args) {
		String input = "A,+,B,*,C,-,D,*,E";
		//String input = "A,+,B,*,C,-,D"; // --> ABC*+CD-
		// postFix has to be
		// ABC*+DE*-
		
		String input2 = "A * B + C * D - E + F" ;
		//AB*CD*+EF+-
		ConvertInfixToPostfix e = new ConvertInfixToPostfix();
		e.convertToPostfix(input.split(","));
		e.convertToPostfix(input2.split(" "));
	}

	/**
	 * for single digit 
	 * @param split
	 * @return
	 */
	public String convertToPostfix(String[] split) {
		GenericStackWithLL stack = new GenericStackWithLL();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < split.length; i++) {
			String s = split[i];
			if (!(s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-"))) {
				sb.append(s);
			} else if ((s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-"))) {
				System.out.print("-> " + s + " <-\n");
				while (!stack.isEmpty() && hasHigherPrecidance((String) stack.top(), s)) {
					while(!stack.isEmpty()){
					sb.append("" + stack.top());
					stack.pop();
					}
				}
				stack.push(s);
			}
		}
		while (!stack.isEmpty()) {
			sb.append(stack.pop() + "");
		}
		System.out.println(sb);
		return sb.toString();
	}
	
	/**
	 * for  digit 
	 * @param split
	 * @return List
	 */
	public List convertToPostfixReturnList(String[] split) {
		GenericStackWithLL stack = new GenericStackWithLL();
		LinkedList<String> linkedList = new LinkedList<>();
		for (int i = 0; i < split.length; i++) {
			String s = split[i];
			if (!(s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-"))) {
				linkedList.add(s);
			} else if ((s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-"))) {
				System.out.print("-> " + s + " <-\n");
				while (!stack.isEmpty() && hasHigherPrecidance((String) stack.top(), s)) {
					while(!stack.isEmpty()){
					linkedList.add("" + stack.top());
					stack.pop();
					}
				}
				stack.push(s);
			}
		}
		while (!stack.isEmpty()) {
			linkedList.add(stack.pop() + "");
		}
		System.out.println(linkedList);
		return linkedList;
	}

	public boolean hasHigherPrecidance(String top, String s) {
		if (top.equals("*") || top.equals("/")) {
			return true;
		}
		return false;
	}
}
