package linkList;

public class LinkedListUs {

	// Properties
	Node head;
	int count;

	// Constructors
	// public LinkedList() {
	// head = null;
	// count = 0;
	// }

	public LinkedListUs(Node newHead) {
		head = newHead;
		count = 1;
	}

	// Methods

	// my add
	public void add1(int newData) {
		Node tmp = new Node(newData);
		Node current = head;
		if (count == 0) {
			head = tmp;
			count = 1;
		} else {
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(tmp);
			count++;
		}
	}

	// add
	public void add(int newData) {
		Node tmp = new Node(newData);
		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(tmp);
		count++;
	}

	// get
	public int get(int index) {
		if (index <= 0) {
			return -1;
		}
		Node current = head;
		for (int i = 1; i < index; i++) {
			current = current.getNext();
		}
		return current.getData();
	}
	
	// size
	public int size() {
		return count;
	}
	// isEmpty
	public boolean isEmpty() {
		return head == null;
	}

	// remove
	public void remove() {
		//remove from the back of the train
		Node current = head ;
		while(current.getNext().getNext() != null){
			current = current.getNext();
		}
		current.setNext(null);
		count--;
	}
	
	@Override
	public String toString() {
		Node current = head;
		while (current.getNext() != null) {
			System.out.print(current.getData()+" ");
			current = current.getNext();
		}
		return super.toString();
	}
	
	public static void main(String[] args) {
		Node n = new Node(1);
		LinkedListUs train = new LinkedListUs(n);
		train.add(2);
		train.toString();
		
	}
}
