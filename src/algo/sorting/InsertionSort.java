package algo.sorting;

import java.util.Arrays;

/**
 * is to be used if the number of element's in the array is very small
 * Created by patimshi on 1/19/2017.
 */
public class InsertionSort {

    public static void main(String[] arg){
        InsertionSort is = new InsertionSort();
        int[] a = {5,2,4,6,1,3};
        //is.insertionS(a);
        int size = 1000000;
        int [] b = new int[size];
        for(int i = 0 ; i < size; i++){
            b[i] = (int) (Math.random()*size) ;
        }
        System.out.println(System.currentTimeMillis());
        //is.insertionS(b);
        is.insertionSortReverse(a);
        System.out.println(System.currentTimeMillis());
        System.out.println(a.length);
    }

    /**
     * Takes array of integer's ,  prints the sorted array and return it
     * @param arr
     */
    public  int[] insertionS(int [] arr){
        //System.out.println("Initial Array : "+ Arrays.toString(arr));
        for(int j = 1 ; j < arr.length ; j++){
            int card = arr[j];
            int i = j -1 ;
            while (i > -1 && arr[i] > card){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = card;
        }
        //System.out.println("Sorted Array : "+ Arrays.toString(arr));
        return arr;
    }

    public int[] insertionSortReverse(int a []){
        System.out.println("Initial Array : "+ Arrays.toString(a));
        for(int j = a.length-2 ; j > -1 ; j--){
            System.out.println("\t"+j+" : "+ Arrays.toString(a));
            int card = a[j] ;
            int i = j + 1 ;
            while (i < a.length && a[i] > card){
                a[i-1] = a[i];
                i++;
            }
            a[i-1] = card;
        }
        System.out.println(" Reverse Sorted Array : "+ Arrays.toString(a));
        return a ;
    }
}

