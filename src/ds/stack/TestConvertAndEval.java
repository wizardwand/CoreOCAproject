package ds.stack;

public class TestConvertAndEval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i = "9 * 2 + 3 + 2 - 1";
		//Postfix should be  
		// 9 2 * 3 2 1 - + + 
		ConvertInfixToPostfix convert = new ConvertInfixToPostfix();
		String post = convert.convertToPostfix(i.split(" "));
		System.out.println(post);
		EvaluateExoressionUsingStack s = new EvaluateExoressionUsingStack();
		s.evalualatePostFix(post);
		
	}

}
