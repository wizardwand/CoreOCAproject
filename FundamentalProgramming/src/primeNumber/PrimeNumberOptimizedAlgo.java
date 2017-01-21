package primeNumber;

import java.util.Scanner;

public class PrimeNumberOptimizedAlgo {

	
	/*
	 Input is 
	 3
12
5
7
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		for(int j = 0; j < no ; j++){
			int isPrimeNo = sc.nextInt();
			System.out.println(isANoPrime(isPrimeNo));
		}
		
	}
	
	private static String isANoPrime(int isPrimeNo ) {
		for(int i = 2 ; i < Math.sqrt(isPrimeNo) ; i++){
			if(isPrimeNo%i == 0 ){
				return "Not prime";
			}
		}
		
		return "Prime";
	}
	
	public static  String isPrime(int N){
	    if (N==1) return "Not prime";
	    if (N==2|| N==3 || N==5 || N==7) return "Prime";
	    if ((N%2==0)||(N%3==0)||(N%5==0)||(N%7==0)) return "Not prime";
	    int i=6;
	    while ((i-1)<Math.sqrt(N)+1){
	        if (N%(i+1)==0 || (N%(i-1)==0)){
	            return "Not prime";
	        }
	        i+=6;
	    }
	    return "Prime";
	}

}
