package ds.stack;

import java.util.LinkedList;

public class StackImpLL implements Stack {

	private LinkedList<Integer> ll = new LinkedList<>();

	public static void main(String[] args) {
		StackImpLL stack = new StackImpLL();
		System.out.println("Is stack empty ? "+stack.isEmpty());
		stack.push(1);
		stack.push(2);
		System.out.println("Is stack empty ? "+stack.isEmpty());
		System.out.println("popped element is :"+stack.pop());
		stack.push(3);stack.push(4);stack.push(5);stack.push(6);
		stack.push(7);
		System.out.println("what is the top element ? "+ stack.top());
		
		StackOpr stack2 = new StackOpr();
		System.out.println("Is stack empty ? "+stack2.isEmpty());
		System.out.println(stack.ll);
		
		stack.pop();stack.pop();stack.pop();stack.pop();stack.pop();
	}

	@Override
	public void push(int i) {
		// TODO Auto-generated method stub
		ll.add(i);
	}

	@Override
	public int pop() {
		return ll.removeLast();
	}

	@Override
	public int top() {
		return ll.getLast();
	}

	@Override
	public boolean isEmpty() {
		return ll.size() > -1 ? false : true;
	}

}
