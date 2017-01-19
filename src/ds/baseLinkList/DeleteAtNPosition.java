package ds.baseLinkList;

public class DeleteAtNPosition {
	private static class Node{
		int data ;
		Node next ;
		Node(int data , Node next){
			this.data = data;
			this.next = next;
		}
	}
	static Node head = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 5 ; i++){
			insert(i);
		}
	}
	private static void insert(int i) {
		// TODO Auto-generated method stub
		if (head == null){
			head = new Node(i,null); 
		}else{
			Node tmp = head;
			while(tmp.next != null){
				tmp =tmp.next;
			}
		}
	}
	
	public static  void deleteFirstNodeInTheLinkList (){
		if(head == null){
			return;
		}else{
			head = head.next;
		}
	}

}
