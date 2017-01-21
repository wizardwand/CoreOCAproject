package queuy;

import java.util.LinkedList;

public class Queuy<E> {

	private LinkedList<E> queue;

	// Making the queue instance
	public <T> Queuy() {
		queue = new LinkedList<E>();
	}

	// check if queue empty
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	// What is the Size of queue?
	public int size() {
		return queue.size();
	}

	// enqueue -- add to Last
	public <T> void enQueue(T n) {
		// queue.add(queue.size()+1, n);
		queue.addLast((E) n);
	}

	// dequeue -- remove from queue -- peek
	public <T> T deQueue() {
		return (T) queue.remove(0);
	}

	// Peek at first item
	public <T> T peek() {
		return (T) queue.get(0);
	}

	// Print Queue
	public <T> void printQueue() {
		System.out.println(queue);
	}

	public static void main(String[] args) {
		try {
			Queuy q = new Queuy();
			//q.deQueue();
			q.enQueue(10);

			q.enQueue(7);
			System.out.println("What Is the peek , i.e the first element in line ? " + q.peek());
			q.enQueue(99);
			q.enQueue("Shirish");
			q.enQueue("Patil");
			System.out.println("Removed from Queue i.e dequed: " + q.deQueue());
			System.out.println("What is the peek ?  " + q.peek());
			System.out.println("Is Queue empty : " + q.isEmpty());
			q.printQueue();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
