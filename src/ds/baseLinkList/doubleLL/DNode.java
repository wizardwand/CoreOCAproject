package ds.baseLinkList.doubleLL;

public class DNode {
	int data;
	DNode next;
	DNode prev;
	/**
	 * 
	 * @param data int
	 * @param next Node
	 * @param prev Node
	 */
	public DNode(int data, DNode next, DNode prev) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
}
