package ds.queue;

public interface ADTQueue<T> {
	public void enqueue(T t);
	public T dequeue();
}
