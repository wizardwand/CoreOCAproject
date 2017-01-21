package array;

import java.util.Scanner;

/*
 * 
 * Sample Imput 
4
1 4 3 2

Sample Output
2 3 4 1
 */

public class ArrayPractice {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        for(int i=0; i < n; i++){
	            arr[i] = in.nextInt();
	        }
	        in.close();
	        
	        for(int i = n-1 ; i >-1 ; i--){
	            System.out.print(arr[i]+" ");
	        }
	    }

}
