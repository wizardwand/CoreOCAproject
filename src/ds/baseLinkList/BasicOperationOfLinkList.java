package ds.baseLinkList;

import java.util.LinkedList;

public class BasicOperationOfLinkList {
	/**
	 * this Class is the node and it will hold the data .
	 */
	static class Node {
		int data;
		Node next;
		public Node (int data , Node next){
			this.data = data;
			this.next = next ;
		}
	}
	
	public static void main(String[] args) {
		//Create a head node which is pointing to null
		// this is because initially the list will be empty 
		Node head = null ;
		
		//We want to create a new Node which will contain data 2 as the first element 
		// hence i create a n1 node 
		// set its data  to 2 and next to null as its the first and one one element in the list
		Node n1 = new Node(2, null);
		
		// Now i have a Node that has been created , so next step is to assign it to the head 
		//As a result my LinkedList is now having one element , head is pointing to it , i.e. 2,null
		head = n1;
		
		//now what i want to do is the list to have 2-> 4-> 6->8->10->null
		//So i have to traverse to the null 
		//now th list is 
		// 2-> null
		// traversal Logic
		Node tmp = head ;
		while(tmp.next != null){
			tmp = tmp.next;
		}
		//create new element 4,null
		Node n2 = new Node(4,null);
		tmp.next = n2 ;
		
		//Traverse and add 6,null
		while(tmp.next != null){
			tmp = tmp.next;
		}
		//Create 6,null
		Node n3 = new Node(6,null);
		tmp.next = n3;
		
		//Traverse 
		tmp = head ;
		while(tmp.next != null){
			tmp = tmp.next;
		}
		//Create Node 8,null
		Node n4 = new Node(8,null);
		tmp.next = n4 ;
		
		//Traverse to null
		tmp = head ;
		while(tmp.next != null){
			tmp = tmp.next;
		}
		Node n5 = new Node(10,null);
		tmp.next = n5;
		
		//print the link List 
		System.out.println("The List Contains the following data:");
		Node tPrint = head ;
		while(tPrint.next != null){
			System.out.print(tPrint.data+" , ");
			tPrint = tPrint.next;
		}
		//This print statement is for the last element 
		//So that it's not missed out while printing 
		System.out.print(tPrint.data);
		System.out.println();
	}

}
