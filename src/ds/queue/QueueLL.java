package ds.queue;

import java.util.LinkedList;

public class QueueLL<T> implements ADTQueue<T> {
	LinkedList<T> ll = new LinkedList<>();

	@Override
	public void enqueue(T t) {
		ll.addLast(t);
	}

	@Override
	public T dequeue() {
		return ll.removeFirst();
	}

	@Override
	public String toString() {
		return ll.toString();
	}
}
