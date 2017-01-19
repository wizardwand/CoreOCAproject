package ds.baseLinkList;

import java.util.Scanner;
/**
 * <h1>Inserting the elements in the Linked List</h1>
 * @author patimshi
 *
 */
public class InsertAtHeadOfLinkList {
	static class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	// Class head Node variable
	private static Node head = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements do you want to put in link list ? \n Enter the number:");
		int numbers = sc.nextInt();
		for (int i = 0; i < numbers; i++) {
			System.out.println("Enter a number : ");
			int data = sc.nextInt();
			insertAtHead(data);
			printLinkList();
		}
		sc.close();
	}

	/**
	 * Store the list in the reverse order of the input 
	 */
	private static void insertAtHead(int data){
		//Here i am assigning the head as the next node of my new node 
		// and then updating  head to the new node 
		//hence the list will be stored in the reverse order 
		Node n = new Node(data,head);
		head = n ;
	}
	
	private static void printLinkList() {
		Node tPrint = head;
		System.out.println("List is: ");
		while (tPrint.next != null) {
			System.out.print(tPrint.data + ",  ");
			tPrint = tPrint.next;
		}
		// This print statement is for the last element
		// So that it's not missed out while printing
		System.out.print(tPrint.data);
		System.out.println();
	}

}
