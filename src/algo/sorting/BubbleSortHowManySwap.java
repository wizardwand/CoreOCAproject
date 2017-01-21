package algo.sorting;

import java.util.Scanner;

/**
 * Created by patimshi on 1/19/2017.
 */
public class BubbleSortHowManySwap {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int[] arr = getInput();

        int numberOfSwaps = 0 ;
        for(int j = 0 ; j < arr.length-1 ; j++)
            for(int i =0 ; i < arr.length - 1 - j ; i++){
                if(arr[i] > arr[i+1]){
                    int tmp = arr[i] ;
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    numberOfSwaps++;
                }
            }
        System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
        System.out.println("First Element: "+arr[0]);
        System.out.println("Last Element: "+arr[arr.length-1]);

    }
    public static int[] getInput(){
        System.out.println("hello tell me the number of array elements ");
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        System.out.println("give all the elements ");
        int array[] = new int[arraySize];
        for(int i = 0 ; i < arraySize ; i++){
            array[i] = sc.nextInt();
        }
        return array;
    }
}
