package ds.queue;

public class TestQueueLL {

	public static void main(String[] args) {
		QueueLL queue = new QueueLL();
		queue.enqueue("shirish");
		queue.enqueue("patil ");
		queue.enqueue("is the Wizard!");
		System.out.println(queue);
		queue.dequeue();
		queue.dequeue();
		System.out.println(queue);
		queue.dequeue();
	}

}
