package ds.stack;

public class StackImplCustomLL implements Stack {
	class Node {
		private int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

		public int getData() {
			return data;
		}
	}
	
	private Node head = null;
	int size = 0;

	@Override
	public void push(int i) {
		if (head == null) {
			head = new Node(i, null);
		} else {
			Node tmp = new Node(i, head);
			head = tmp;
		}
		size++;
	}

	@Override
	public int pop() {
		int tmpData = 0;
		if (size > 0) {
			tmpData = head.getData();
			head = head.next;
			size--;
		} else {
			System.out.println("Stack is UNDER-FLOW");
		}
		return tmpData;
	}

	@Override
	public int top() {
		return size > 0 ? head.getData() : 0;
	}

	@Override
	public boolean isEmpty() {
		return size > 0 ? false : true;
	}

}
