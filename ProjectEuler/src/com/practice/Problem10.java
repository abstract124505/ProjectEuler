package com.practice;

public class Problem10 {

	public static boolean isPrime(int number){
		if(number < 2)
			return false;
		if(number == 2)
			return true;
		
		if(number % 2 == 0)
			return false;
		
		for(int i=3; i <= Math.sqrt(number); i+=2){
			if(number % i == 0)
				return false;
		}
		return true;
	}
	
	public static void primeList(int target){
		long primeSum=0;
		for(int i=2; i < target; i++){
			 if(isPrime(i)){
				// System.out.print(i+",");
				 primeSum += i;
			 }
		}
		//System.out.println();
		System.out.println(primeSum);
	}
	
	
	public static void main(String[] args) {
		//System.out.println(Problem10.isPrime(21));
        Problem10.primeList(2000000);
	}

}
