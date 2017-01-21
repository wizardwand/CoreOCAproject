package practice;

import java.util.Arrays;
import java.util.Scanner;

public class SparseArray {
	
    static String[] a1 , a2 ;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sn = new Scanner(System.in);
        int in = sn.nextInt();
        a1= new String[in];
        for(int i = 0 ; i < in ; i++ ){
            a1[i] = sn.next();
        }
        int in2 = sn.nextInt();
        a2 = new String[in2];
        for(int i = 0 ; i < in2; i++ ){
            a2[i] = sn.next();
        }
        sn.close();
        int count = 0 ;
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        for(int i = 0 ; i < in2  ; i++ ){
            for(int j = 0 ; j < in ; j++ ){
                if(a1[j].equals(a2[i])){
                    count+=1;
                }
                
            }
            System.out.println(count);
            count = 0 ;
        }
    }
}
