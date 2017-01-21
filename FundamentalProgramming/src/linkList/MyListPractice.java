package linkList;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

class MyNode {
	int data;
	MyNode next;
}

interface AbsLinkList {
	// adds the element at the last of the list ,
	// Bcoz it maintains the insertion order
	void add(int n);

	// return the first element of the list
	int peek();

	// display the list
	void displayList();
	
	void printReverseRecursive(MyNode h);

}

class ShnuxLinkList implements AbsLinkList {

	MyNode head = null;

	@Override
	public void add(int data) {
		MyNode nNode = new MyNode();
		nNode.data = data;
		nNode.next = null;
		if (head == null) {
			head = nNode;
		} else {
			MyNode tmp = head;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = nNode;
		}

	}

	// traverse & Display
	@Override
	public void displayList() {
		int count = 1;
		MyNode start = this.head;
		if (start != null) {
			System.out.println(count + " element is : " + start.data);
			while (start.next != null) {
				start = start.next;
				count++;
				System.out.println(count + " element is : " + start.data);
			}
		} else {
			System.out.println("Sorry there are no Elements in the List");
		}
	}

	@Override
	public int peek() {
		// TODO Auto-generated method stub
		return this.head != null ? this.head.data : 0;
	}

	public void printReverseRecursive(MyNode h) {
		if (h == null) {
		} else {
			printReverseRecursive(h.next);
			System.out.println(h.data);
		}
	}


	public void printReverse() {
		LinkedList<Integer> l = new LinkedList();
		MyNode tmp = head;
		while (tmp.next != null) {
			l.add(tmp.data);
			tmp = tmp.next;
		}
		l.add(tmp.data);
		while (!l.isEmpty()) {
			System.out.println(l.removeLast());
		}
	}

	public void removeDublicates() {
		Set<Integer> set = new HashSet<>();
		MyNode tmp = head;
		while (tmp.next != null) {
			set.add(tmp.data);
			tmp = tmp.next;
		}
		// System.out.println("Set is : "+ set);

		// Cleared all the values from the list
		this.head = null;

		// Create new List
		for (int i : set) {
			add(i);
		}
	}

}

public class MyListPractice {
	public static void main(String[] args) {
		ShnuxLinkList l = new ShnuxLinkList();
		l.add(1);
		l.add(2);
		l.add(5);
		l.add(4);
		l.add(5);
		l.add(77);
		l.displayList();
		l.printReverseRecursive(l.head);
		System.out.println("The Peek element is :" + l.peek());
		System.out.println("__________________After Removing Dublicates_________________");
		l.removeDublicates();
		l.displayList();

	}
}
