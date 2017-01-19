package ds.stack;

public class ReverseUsingStack {
	public static void main(String[] args) {
		GenericStackWithLL stack = new GenericStackWithLL();
		char[]  input = "shirish".toCharArray(); 
		for(int i =0 ; i < input.length ; i++){
			stack.push((Character) input[i]);
		}
		
		System.out.println("the reverse is : ");
		while(!stack.isEmpty()){
			System.out.print(stack.pop()+" ");
		}
		
		stack.push(1);stack.push(2);stack.push(3);stack.push(4);stack.push(5);
		System.out.println("\nThe reverse of integer is :");
		while(!stack.isEmpty()){
			System.out.print(stack.pop()+" ");
		}
	}
}
