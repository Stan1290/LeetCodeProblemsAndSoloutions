package com.LeetCodeProblems.MyPow;

public class MoPow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(myPow(2.0, 10));

	}

	public static double myPow(double x, int n) {
		  if (n == 0) {
	            return 1;
	        }
	        if (n < 0) {
	            n *= -1;
	            x = 1 / x;
	        }
	        
	        return helper(x, n);
	}
	
	public static double helper(double x, int n){
		if(n == 0){
			return 1;
		}
		if( n % 2 == 0){
			double i = x * x;
			int half = n / 2;
			return helper(x * x, n /2);
					
	}
		else{
			double i = x * x;
			int half = n / 2;
			return helper(x * x, n/2) * x;
		}
		}
}
