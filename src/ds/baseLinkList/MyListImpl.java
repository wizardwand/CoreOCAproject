package ds.baseLinkList;

public class MyListImpl implements MyList {

	private Node head;
	private int size;

	public static void main(String[] args) {
		MyListImpl list = new MyListImpl();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.printList();
		//list.remove(7);
		list.insertAtNthPosition(2, 100);
		System.out.println();
		list.printList();
		//Node hRef = list.head ;
		//System.out.println("Printing Recursively");
		//list.printListRecurcive(hRef);
		list.reverseList();
		//Reverse list with recursion
		System.out.println("\nReverse list with recursion");
		list.reverseListRecursion(list.head);
	}

	@Override
	public boolean add(int data) {
		// TODO Auto-generated method stub
		// temporary Node create
		boolean isAdded = false;
		Node tNode = new Node(data, null);
		if (head == null) {
			head = tNode;
			isAdded = true;
		} else {
			// create a reference to Head , as we don'e want to changes its
			// position
			Node headRef = head;
			while (headRef.next != null) {
				headRef = headRef.next;
			}
			headRef.next = tNode;
		}
		return isAdded;
	}

	@Override
	public boolean remove(int position) {
		boolean isRemoved = false;
		if (position + 1 > size && position > 0) {
			System.out.println("Entered Wrong position!");
		} else {
			isRemoved = true;
			if (position == 1) {
				head = head.next;
			} else {
				// create a reference to Head , as we don'e want to changes its
				// position
				Node headRef = head;
				for (int i = 1; i < position-1; i++) {
					headRef = headRef.next;
				}
				headRef.next = headRef.next.next;
			}
		}
		return isRemoved;
	}

	@Override
	public void printList() {
		// create a reference to Head , as we don'e want to changes its position
		Node headRef = head;
		while (headRef != null) {
			System.out.print(headRef.data + ",  ");
			headRef = headRef.next;
		}
	}
	
	public void printListRecurcive(Node headRef){
		if(headRef == null){
			return;
		}else{
			System.out.print(", "+headRef.data);
			printListRecurcive(headRef.next);
		}
	}

	@Override
	public int getSize() {
		System.out.println("Size of List : " + size);
		return size;
	}
	
	public boolean insertAtNthPosition(int position,int data) {
		boolean  isInserted = false;
		if (position  > size && position < 0) {
			System.out.println("Entered Wrong position!");
		}else{
			isInserted = true;
			// create a reference to Head , as we don'e want to changes its position
			Node headRef = head;
			for(int i = 1 ; i < position-1; i++){
				headRef = headRef.next;
			}
			headRef.next  = new Node(data,headRef.next);
		}
		return isInserted;
	}
	
	public void reverseList(){
		System.out.println("Reverse List is :");
		Node headReverse = null;
		Node headRef = head;
		while(headRef != null){
			headReverse = new Node (headRef.data,headReverse );
			headRef = headRef.next;
		}
		printListRecurcive(headReverse);
	}
	
	public void reverseListRecursion(Node head){
		if(head != null){
			reverseListRecursion(head.next);
			System.out.print(head.data+", ");
		}else{
			return;
		}
	}

}
