package ds.stack;

class Node<T> {
	private T data;
	Node<T> next;

	Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}
}

public class GenericStackWithLL  {
	private Node<? extends Object> head = null;
	int size = 0;

	public void push(Object i) {
		if (head == null) {
			head = new Node<Object>(i, null);
		} else {
			Node<Object> tmp = new Node(i, head);
			head = tmp;
		}
		size++;
	}

	public Object pop() {
		Object tmpData = null;
		if (size > 0) {
			tmpData = (Object) head.getData();
			head = head.next;
			size--;
		} else {
			System.out.println("Stack is UNDER-FLOW");
		}
		return (Object) tmpData;
	}

	public Object top() {
		return  size > 0 ?(Object) head.getData() :(Object) 0;
	}

	public boolean isEmpty() {
		return size > 0 ? false : true;
	}

}
