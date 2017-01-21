package linkList;

import java.util.LinkedList;
import java.util.List;

public class LLTest {

	// Variables
	private List<Character> stack;
	private List<Character> queue;
	private int counts, countq, deque = 0;

	// Constructor
	LLTest() {
		counts = 0;
		countq = 0;
		stack = new LinkedList();
		queue = new LinkedList();
	}

	// methods
	public void pushCharacter(char c) {
		stack.add(c);
		counts++;
	}

	public void enqueueCharacter(char c) {
		queue.add(c);
		countq++;
	}

	public char popCharacter() {
		Character c = stack.get(counts - 1);
		counts--;
		return c;
	}

	public char dequeueCharacter() {
		Character c = queue.get(deque);
		deque++;
		return c;
	}

	public static void main(String[] args) {
		String s = "123454321";
		char[] str = s.toCharArray();
		LLTest p = new LLTest();

		for (char c : str) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

//		System.out.println(p.queue);
//		System.out.println(p.stack);

		boolean isPalanfrome = true;
		for (int i = 0; i < str.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalanfrome = false;
				break;
			}
		}
		System.out.println("is Palandrome : " + isPalanfrome);

	}

}
