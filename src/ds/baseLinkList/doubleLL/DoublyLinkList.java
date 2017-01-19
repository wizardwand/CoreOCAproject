package ds.baseLinkList.doubleLL;

public class DoublyLinkList {
	private DNode head;
	private int size;

	public static void main(String[] args) {
		DoublyLinkList dll = new DoublyLinkList();
		dll.insertAtTail(1);
		dll.insertAtTail(3);
		dll.insertAtTail(5);
		dll.insertAtTail(7);
		dll.insertAtTail(9);
		dll.traverseDoublyLinkList();
		System.out.println();
		dll.insertAtHead(99);
		System.out.println("After Adding 99 @ HEAD");
		dll.traverseDoublyLinkList();
		System.out.println("Print List in reverse");
		dll.printListInReverse();
	}

	public void printListInReverse() {
		if (head != null) {
			DNode refDll = head;
			while (refDll.next != null) {
				//System.out.print(", " + refDll.data);
				refDll = refDll.next;
			}
			//System.out.println();
			while (refDll != null) {
				System.out.print(", " + refDll.data);
				refDll = refDll.prev;
			}
		}
	}

	public void insertAtTail(int i) {
		DNode newNode = getNewNode(i);
		if (head == null) {
			head = newNode;
		} else {
			DNode refDll = head;
			while (refDll.next != null) {
				// System.out.println(refDll.data);
				refDll = refDll.next;
			}
			refDll.next = newNode;
			newNode.prev = refDll;
		}
	}

	public void traverseDoublyLinkList() {
		if (head != null) {
			DNode refDLL = head;
			while (refDLL != null) {
				System.out.print(", " + refDLL.data);
				refDLL = refDLL.next;
			}
		} else {
			System.out.print("List is Empty");
		}
	}

	public void insertAtHeadReferedMethod(int i) {
		DNode newNode = getNewNode(i);
		if(head == null){
			head = newNode;
		}else{
			head.prev = newNode;
			newNode.next = head ;
			head = newNode;
		}
	}
	
	public DNode getNewNode(int data) {
		return new DNode(data, null, null);
	}

	
	public void insertAtHead(int i) {
		if (head == null) {
			head = new DNode(i, null, null);
		} else {
			DNode tmp = new DNode(i, head, null);
			head.prev = tmp;
			head = tmp;
		}
	}

}
