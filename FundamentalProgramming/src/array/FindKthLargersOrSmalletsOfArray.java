package array;

import java.util.Scanner;

public class FindKthLargersOrSmalletsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		approach1SortedArray();
		
		//I  want the values to be unsorted
		//so plan to use the random class
		unsortedArrayApproach();
	}

	private static void unsortedArrayApproach() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input size of array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		//Bellow code will give the sorted array 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.abs(Math.random()*arr.length);
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println("Give the k'th possision to be found");
		int k = sc.nextInt();
		sc.close();
		System.out.println("K'th highest is: "+ arr[arr.length-k] );
		System.out.println("K'th smallest is: "+arr[k-1]);
	}

	private static void approach1SortedArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input size of array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		//Bellow code will give the sorted array 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i ;
		}
		
		System.out.println("Give the k'th possision to be found");
		int k = sc.nextInt();
		sc.close();
		System.out.println("K'th highest is: "+ arr[arr.length-k] );
		System.out.println("K'th smallest is: "+arr[k-1]);
	}

}
