package com.practice;

public class Problem9 {


	
	
	public static void main(String[] args) {
		final int SUM = 1000;
		
		for(int a=2 ; a < SUM; a++){
			for(int b=1; b < a; b++){
				int c = SUM - ( a + b );
				
				if( (a * a)+ (b * b) == (c * c)){
                   System.out.println(a +","+b+","+c);   
					System.out.println(a*b*c);
				}
			}
		}
		

	}

}
