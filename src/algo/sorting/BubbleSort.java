package algo.sorting;

import java.util.Arrays;

/**
 * Created by patimshi on 1/19/2017.
 */
public class BubbleSort {
    public static void main (String args[]){
        int[] a = {10,3,1,2,5,7,1};
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(a);
    }

    public int[] bubbleSort(int[] arr){
        System.out.println("org Array is :"+Arrays.toString(arr));
        for(int j = 0 ; j < arr.length-1 ; j++)
        for(int i =0 ; i < arr.length - 1 - j ; i++){
            if(arr[i] > arr[i+1]){
                int tmp = arr[i] ;
                arr[i] = arr[i+1];
                arr[i+1] = tmp;
            }
        }
        System.out.println("Sorted  Array is :"+Arrays.toString(arr));
        return  arr;
    }
}
