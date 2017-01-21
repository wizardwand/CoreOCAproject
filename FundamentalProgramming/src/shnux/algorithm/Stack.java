package shnux.algorithm;

public class Stack {
	public static void main(String[] args) {
		MyBookStack m = new MyBookStack();
		m.topElement();
		m.push(1);
		m.push(2);
		m.push(3);
		m.push(4);
		m.pop();
		m.push(6);
		m.printStack();
		m.topElement();
	}
}

interface StackDS {
	void push(int pu);

	void pop();

	void topElement();

	void printStack();
}

class MyBookStack implements StackDS {

	private int stack[];
	private int currentIndex = 0;
	final private static int MAX = 5;

	public MyBookStack() {
		stack = new int[MAX];
	}

	@Override
	public void topElement() {
		// 09059581461
		// Rahul Balki
		if (currentIndex > 0)
			System.out.println("Top element is : " + stack[currentIndex - 1]);

	}

	@Override
	public void push(int pu) {
		if (currentIndex < MAX) {
			this.stack[currentIndex] = pu;
			currentIndex++;
		} else {
			System.err.println("Stack is full , can't add");
		}
	}

	@Override
	public void pop() {
		if (currentIndex > 0) {
			this.stack[currentIndex - 1] = 0;
			currentIndex--;
		} else {
			System.err.println("Stack is EMPTY , cant remove");
		}
	}

	@Override
	public void printStack() {
		System.out.println("the Stack is ");
		for (int i = stack.length - 1; i >= 0; i--) {
			System.out.print(" " + stack[i] + " ");
		}
	}
}
