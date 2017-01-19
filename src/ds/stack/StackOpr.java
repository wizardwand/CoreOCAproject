package ds.stack;

public class StackOpr  implements Stack{

	private int[] stackOfDish = new int [5];
	private  int top = -1;
	public static void main(String[] args) {
		StackOpr stack = new StackOpr();
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
		stack.pop();stack.pop();stack.pop();stack.pop();stack.pop();
	}

	@Override
	public void push(int i) {
		System.out.println("Top is : "+top);
		if(top < stackOfDish.length-1){
			top += 1 ; 
			stackOfDish[top] = i ;
		}else {
			System.out.println("Stack is full ! Try to pop, before you push. ");
		}
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		int topToReturn = 0 ;
		if(top > -1 ){
			topToReturn  = stackOfDish[top];
			top--;
		}else{
			System.out.println("The stack is empty, try to push elements first:");
		}
		return topToReturn;
	}

	@Override
	public int top() {
		int topToReturn = 0 ;
		if(top > -1 ){
			topToReturn  = stackOfDish[top];
		}else{
			System.out.println("The stack is empty, try to push elements first:");
		}
		return topToReturn;
	}

	@Override
	public boolean isEmpty() {
		if(top>0){
			return false;
		}
		return true;
	}

}
