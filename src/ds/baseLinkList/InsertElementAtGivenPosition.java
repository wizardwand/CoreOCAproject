package ds.baseLinkList;

import java.util.Scanner;

public class InsertElementAtGivenPosition {

	private static class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	static int size = 0;
	static Node head = null;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("How many elements do you want to put in link list ? \n Enter List SIZE :");
		int numbers = 5; // sc.nextInt();
		for (int i = 99; i < 99 + numbers; i++) {
			// System.out.println("Enter List element : ");
			// int data = sc.nextInt();
			insertAtLast(i + 1);
			printLinkList();
		}
		insertAtposition();
		printLinkList();
		sc.close();
	}

	private static void insertAtposition() {
		System.out.println("Do you want to insert in between the list ? If yes type Y");
		char ch = sc.next().toUpperCase().charAt(0);
		if ('Y' == ch) {
			System.out.println("Enter the VALUE to be inserted : ");
			int data = sc.nextInt();
			System.out.println("Enter the POSITION where you waht to insert : ");
			int position = sc.nextInt();
			if (position < size ) {
				Node tmp = head;
				int i = 1;
				while (i < position - 1) {
					System.out.println("Head data " + head.data);
					tmp = tmp.next;
					i++;
				}
				tmp.next = new Node(data, tmp.next);
			}else{
				insertAtLast(data);
			}
		}
	}

	/**
	 * Store the list as per the given order of the list
	 */
	private static void insertAtLast(int data) {
		Node n = new Node(data, null);
		Node tmp = head;
		if (head == null) {
			head = n;
		} else {
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = n;
		}
		size++;
	}

	private static void printLinkList() {
		Node tPrint = head;
		System.out.println("List is: ");
		while (tPrint.next != null) {
			System.out.print(tPrint.data + " , ");
			tPrint = tPrint.next;
		}
		// This print statement is for the last element
		// So that it's not missed out while printing
		System.out.print(tPrint.data);
		System.out.println();
	}
}
