package com.practice;

public class Problem7 {

	
	
	
	//this is a sample test comment
	public static boolean isPrime(int num){
		if(num < 2)
			return false;
		if(num == 2)
			return true;
		if(num % 2 == 0)
			return false;
		for(int i=3; i <= Math.sqrt(num); i+=2){
			if(num%i == 0)
				return false;
			}
		return true;
	}
	public static void main(String[] args) {
		
		//System.out.println(Problem7.isPrime(7));
		//System.out.println((int)Math.sqrt(7));

		int counter = 1;
		int number=1;
		while(counter < 10001){
			number+=2;
	        if(Problem7.isPrime(number)){
	        	counter++;
	        }
		}
		System.out.println(number);
	}

}
