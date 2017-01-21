package practice;

import java.util.Scanner;

public class Read {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int ii = 0 ;
        String a[] = new String[10];
        for(int i = 0 ; i < 5 ; i++){
			if (s.hasNext()) {
				a[ii] = s.next();ii++;
			} else {
				break;
			}
        }
        
        
		           
		s.close();
        for(String s1 : a){
            System.out.println(s1);
        }
	}

}
