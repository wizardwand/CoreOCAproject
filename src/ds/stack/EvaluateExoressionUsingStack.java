package ds.stack;

public class EvaluateExoressionUsingStack {
	public static void main(String[] args) {
		//Infix Expression is bellow
		//2 * 3 + 5 * 4  - 9 
		String postfixExpression = "23*54*+9-";
		EvaluateExoressionUsingStack e = new EvaluateExoressionUsingStack();
		e.evalualatePostFix(postfixExpression);
		String prefixExpression = "-+*23*549";
		e.evalualatePreFix(prefixExpression);
	}

	public void evalualatePreFix(String prefixExpression) {
		GenericStackWithLL stack = new GenericStackWithLL();
		char[] sh = prefixExpression.toCharArray();
		for(int i = sh.length-1 ; i >-1 ; i--){
			char c = sh[i];
			if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9'
					|| c == '0') {
				stack.push(c);
			} else {
				int o1 = Integer.parseInt(stack.pop()+"");
				int o2 =Integer.parseInt(stack.pop()+"");
				int res = 0;
				if (o1 > o2) {
					res = getResult(o1, o2, c);
				} else {
					res = getResult(o2, o1, c);
				}
				stack.push(res);
				System.out.println(res);
			}
		}
		System.out.println("final result is: "+stack.pop());
	}

	public void evalualatePostFix(String postfixExpression) {
		GenericStackWithLL stack = new GenericStackWithLL();
		for (char c : postfixExpression.toCharArray()) {
			if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9'
					|| c == '0') {
				stack.push(c);
			} else {
				int o1 = Integer.parseInt(stack.pop()+"");
				int o2 =Integer.parseInt(stack.pop()+"");
				int res = 0;
				if (o1 > o2) {
					res = getResult(o1, o2, c);
				} else {
					res = getResult(o2, o1, c);
				}
				stack.push(res);
				System.out.println(res);
			}
		}
		System.out.println("final result is: "+stack.pop());
	}

	public int getResult(int o1, int o2, char c) {
		switch (c + "") {
		case "*":
			return o1 * o2;
		case "/":
			return o1 / o2;
		case "+":
			return o1 + o2;
		case "-":
			return o1 - o2;
		}
		return 0;
	}

}
