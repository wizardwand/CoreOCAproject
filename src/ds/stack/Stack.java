package ds.stack;
/**
 * LIFO - Last IN First Out
 * Applicastions:
 * function calls
 * Recursion
 * Undo operation in an editor's
 * Compiler check's - parenthesis
 * @author patimshi
 *
 */
public interface Stack {
	/**
	 * Insert element @ Top of Stack
	 * @param i
	 */
	public void push(int i);
	/**
	 * Remove the top element in the stack and return it 
	 * @return void
	 */
	public int pop();
	/**
	 * get the top element in the Stack
	 * @return int
	 */
	public int top();
	/**
	 * return the status of stack
	 * @return boolean
	 */
	public boolean isEmpty();
	
}
