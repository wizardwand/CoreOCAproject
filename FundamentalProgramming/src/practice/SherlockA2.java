package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SherlockA2 {

	public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
			
			Scanner s = new Scanner(System.in);
			Map <Integer , List<Integer>> m = new HashMap();
			int ct = s.nextInt();
			for (int j = 0; j < ct; j++) {
				List<Integer> ll = new LinkedList<>();
				int sz = s.nextInt();
				int reI = 0 ;
				while(sz > reI){
					ll.add(s.nextInt());reI++;
				}
				m.put(j, ll);
			}
			s.close();
			
			Set<Integer> set = m.keySet();
			Iterator<Integer> ii = set.iterator();
			String res = "NO";
			while(ii.hasNext()){
				List<Integer> lm = m.get(ii.next());
				if(lm.size() == 1 ){
					res = "YES";
				}if(lm.size() == 2){
					if(lm.get(0) != lm.get(1)){
						res = "NO";
					}else{
						res = "YES";
					}
				}
				else{
					for(int index = 1 ; index < lm.size() -1 ; index++){
						//if(getCenter(lm,index)){
							if(isSher(lm)){
								res = "YES";
								System.out.println(res);
							}
//							}else{
//								System.out.println("NO");
//							}
						}
					}
				}
				System.out.println(res);
			}
		
			private static boolean isSher(List<Integer> aa) {
				Object[] array = aa.toArray();
			    int i = 0;
			    int j = array.length - 1;
			    int sum = 0;
			    while (i != j) {
			        if(sum >= 0) {
			            sum -= (Integer)array[j];
			            j--;
			        } else {
			            sum += (Integer) array[i];
			            i++;
			        }
		
			    }
			    return sum == 0 ? true : false;
		}
	    
		
	    private static boolean getCenter(List<Integer> aa, int i) {
			Object[] a = aa.toArray();
			int sL = 0, sR = 0;
			for (int j = 0; j < i; j++) {
				sL += (Integer) a[j];
			}
			for (int j = a.length - 1; j > i; j--) {
				sR += (Integer) a[j];
			}
			if (sL == sR ) {
				return true;
			} else {
				return false;
			}
		}
	    
}
