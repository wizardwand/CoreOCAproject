package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HourGlassProbablity {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sz = 6;
		int[][] a = new int[sz][sz];
		for (int i = 0; i < sz; i++) {
			for (int j = 0; j < sz; j++) {
				if (s.hasNext()) {
					a[i][j] = s.nextInt();
				}
			}
		}
		s.close();

		/*for (int i = 0; i < sz; i++) {
			System.out.println();
			for (int j = 0; j < sz; j++) {
				System.out.print(" " + a[i][j]);
			}
		}*/
		//appr1(sz, a);
		//appr2(sz, a);
		//appr3(sz, a);
		ap4(a);
		/*
		 * 
		Scanner sc = new Scanner(System.in);
        int[][] array = new int[6][6];
        for (int y = 0; y < 6; y++){
            for (int x =0; x<6; x++){
                array[x][y] = sc.nextInt();
            }
        }
        int maxHourglass = getHourglass(array, 1,1);
        for (int y=1; y<5; y++){
            for (int x=1; x<5; x++){
                int hourres = getHourglass(array, x, y);
                if (hourres > maxHourglass){
                    maxHourglass = hourres;
                }
            }
        }
        System.out.println(maxHourglass);
		 */
		
	}
	public static int getHourglass(int[][] array, int x, int y) {
        return array[x][y] + array[x-1][y-1] + array[x][y-1] + array[x+1][y-1] + array[x-1][y+1]
            + array[x][y+1] + array[x+1][y+1];
    }
	
	private static void ap4(int[][] arr){
		int[] count = new int[4*4];

	    int x = 0;
	    for (int i = 0; i < 4; i++) {
	        for (int j = 0; j < 4; j++) {
	            try {
	                count[x] = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
	                x++;
	            } catch (Exception e) {
	            }
	        }
	    }

	    Arrays.sort(count);
	    System.out.print(count[count.length-1]);
	}
	private static void appr3(int sz, int[][] a) {
		List<Integer > l = new ArrayList();
		int tmp = 0;
		for (int row = 0 ; row < sz-1 ; row++) {
			for (int  col  = 0 ; col < (sz - 2) ; col++) {
				int sum = 0;
					/*System.out.println("\n"+row+" "+col +"\t"+ a[row][col] +
							"\n"+row+" "+(col+1) +"\t"+ a[row][col + 1] +
							"\n"+row+" "+(col+2) +"\t"+a[row][col + 2] 
							+"\n"+(row+1)+" "+(col+1) +"\t"+ a[row + 1][col + 1]
							+"\n"+(row+2)+" "+(col) +"\t"+ a[row + 2][col] 
							+"\n"+(row+2)+" "+(col+1) +"\t"+ a[row + 2][col + 1]
							+"\n"+(row+2)+" "+(col+2) +"\t"+ a[row][col + 2]);*/
				if((col + 1) < (sz-1) && row < (sz - 2)){
					sum = a[row][col] + a[row][col + 1] + a[row][col + 2] 
							+ a[row + 1][col + 1]
							+ a[row + 2][col] + a[row + 2][col + 1]+ a[row + 2 ][col + 2];
					}
				//System.out.println("sum is : " + sum);
				l.add(sum);
			}
		}
		Collections.sort(l);
		System.out.println(l);
		Object[] ss = l.toArray();
		System.out.println("The Highest is : "+ ss[ss.length - 1]);
	}
	
	private static void appr1(int sz, int[][] a) {
		int tmp = 0;
		for (int j = 0; j < (sz - 1) / 2; j += (sz / 2)) {
			for (int i = 0; i < (sz - 3) ; i++) {
				int sum = 0;
				if ((i + j) < ((sz - 1) / 2)) {
					System.out.println("\n"+i+" "+j +"\t"+ a[i][j] +
							"\n"+i+" "+(j+1) +"\t"+ a[i][j + 1] +
							"\n"+i+" "+(j+2) +"\t"+a[i][j + 2] 
							+"\n"+(i+1)+" "+(j+1) +"\t"+ a[i + 1][j + 1]
							+"\n"+(i+2)+" "+(j) +"\t"+ a[i + 2][j] 
							+"\n"+(i+1)+" "+(j+1) +"\t"+ a[i + 2][j + 1]
							+"\n"+(i)+" "+(j+2) +"\t"+ a[i][j + 2]);
					sum = a[i][j] + a[i][j + 1] + a[i][j + 2] 
							+ a[i + 1][j + 1]
							+ a[i + 2][j] + a[i + 2][j + 1]
							+ a[i][j + 2];
				}
				System.out.println("sum is : " + sum);
			}
		}
	}

	private static void appr2(int sz, int[][] a) {
		int tmp = 0;
		
			for (int i = 0; i < (sz - 3) ; i++) {
				//for (int j = i; j < (sz ) / 2; j ++) {
				for (int j = i; j < (sz - 3) ; j ++) {
				int sum = 0;
				//if ((i + j) < ((sz - 1) / 2)) {
				/*	System.out.println("\n"+i+" "+j +"\t"+ a[i][j] +
							"\n"+i+" "+(j+1) +"\t"+ a[i][j + 1] +
							"\n"+i+" "+(j+2) +"\t"+a[i][j + 2] 
							+"\n"+(i+1)+" "+(j+1) +"\t"+ a[i + 1][j + 1]
							+"\n"+(i+2)+" "+(j) +"\t"+ a[i + 2][j] 
							+"\n"+(i+2)+" "+(j+1) +"\t"+ a[i + 2][j + 1]
							+"\n"+(i+2)+" "+(j+2) +"\t"+ a[i+2][j + 2]);
				*/	sum = a[i][j] + a[i][j + 1] + a[i][j + 2] 
							+ a[i + 1][j + 1]
							+ a[i + 2][j] + a[i + 2][j + 1]
							+ a[i + 2][j + 2];
				//}
				//System.out.println("sum is : " + sum);
			}
		}
	}

}
