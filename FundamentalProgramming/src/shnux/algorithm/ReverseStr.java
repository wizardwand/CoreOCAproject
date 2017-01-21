package shnux.algorithm;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseStr {
	
	public static void main(String[] args) {
		ReverseStrUsingStack st = new ReverseStrUsingStack("I love cycling!!");
		st.printStack();
		st.reverse();
	}
}
class ReverseStrUsingStack implements StackDS{
	
	LinkedList stack =new LinkedList();;
	
	public ReverseStrUsingStack(){
	}
	
	public void reverse() {
		System.out.println("Reverse is : "+ popLL());
	}

	public ReverseStrUsingStack(String st){
		if(null != st){
			char[] chArray = st.toCharArray();
			for(char c : chArray){
				pushMy(c);
			}
		}
	}
	
	@Override
	public void push(int pu) {
		stack.add(pu);
	}
	
	public void pushMy(char pu) {
		stack.add(pu);
	}

	@Override
	public void pop() {
		
		
	}
	
	public String popLL(){
		
		Iterator i = stack.iterator();
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()){
			char c = (char) stack.getLast();
			sb = sb.append(c);
			stack.removeLast();
		}
		return sb.toString();
	}
	

	@Override
	public void topElement() {
	}

	@Override
	public void printStack() {
		Iterator i = stack.iterator();
		System.out.print("Original String is :");
		while (i.hasNext()) {
			System.out.print(i.next().toString());
		}
		System.out.println();
	}
	
}
