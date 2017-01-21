package printPyramid;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		System.out.println("Enter the Base size of Pyramid");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		s.close();
		
		leftMostpyramid(size);
		
		System.out.println();
		rightMostPyramid(size);
	}
	
	public static void leftMostpyramid(int size) {
		System.out.println("Left Most Pyramid is :");
		if (size > 2) {
			for (int i = 0; i < size; i++) {
				System.out.println();
				for (int j = 0; j < size; j++) {
					if(i+j < size){
						System.out.print("$");
					}else if(i+j >size){
						System.out.print(" ");
					}
				}
			}
		}
	}

	
	public static void rightMostPyramid(int size) {
		System.out.println("Right Most Pyramid is :");
		if (size > 2) {
			for (int i = 0; i < size; i++) {
				System.out.println();
				for (int j = 0; j < size; j++) {
					if(i+j >= size-1){
						System.out.print("$");
					}else if(i+j <size){
						System.out.print(" ");
					}
				}
			}
		}
	}

}
