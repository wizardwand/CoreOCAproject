package ds.stack;

public class TESTStackImplCustomLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImplCustomLL stack = new StackImplCustomLL();
		stack.pop();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println("the top is : "+stack.top());
		System.out.println("the size of stack is: "+stack.size);
		
		stack.pop();stack.pop();stack.pop();stack.pop();
		System.out.println("the top is : "+stack.top());
		stack.pop();stack.pop();
		
	}

}
