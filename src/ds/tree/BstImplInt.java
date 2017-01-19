package ds.tree;

public class BstImplInt {

	static BSTNode root = null;

	public static void main(String[] args) {
		// BstImplInt bst = new BstImplInt();
		// bst.
		root = insert(root, 15);
		root = insert(root, 10);
		root = insert(root, 20);
		root = insert(root, 25);
		root = insert(root, 8);
		root = insert(root, 12);
		root = insert(root, 24);
		root = insert(root, 32);
		int no = 10;
		String res = (search(root, no) == true) ? "YES" : "NO";
		System.out.println("is " + no + " present ? " + res);
		
		System.out.println("the height of the tree is : "+findHeight(root));
	}

	public static BSTNode insert(BSTNode root2, int data) {
		if (root2 == null) {// tree empty
			root2 = new BSTNode(data);
			// tree is not empty
		} else if (data <= root2.data) {
			// if the data is less or equal
			root2.left = insert(root2.left, data);
		} else {// if (data > root2.data) {
			// if the data is less or equal
			root2.right = insert(root2.right, data);
		}
		return root2;
	}

	public static boolean search(BSTNode root, int data) {
		if (root == null) {
			return false;
		} else if (root.data == data) {
			return true;
		} else if (data <= root.data) {
			return search(root.left, data);
		} else {
			return search(root.right, data);
		}
	}

	public static int findMin(BSTNode root) {
		if (root == null) {
			System.out.println("Tree is empty !");
			return -1;
		}
		while (root.left != null) {
			root = root.left;
		}
		return root.data;
	}

	public static int findMinRecurcive(BSTNode root) {
		if (root == null) {
			System.out.println("Tree is empty !");
			return -1;
		} else if (root.left == null) {
			return root.data;
		}
		return findMinRecurcive(root.left);
	}

	public static int findHeight(BSTNode root){
		int left = 0, right =0 ;
		if(root == null){
			return -1;
		}else{
			left = findHeight(root.left);
			right = findHeight(root.right);
			System.out.println("left : "+ left + " right : "+right);
			return Math.max(left, right) + 1 ;
		}
	}
}
