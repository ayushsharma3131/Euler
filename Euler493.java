package Euler;

import java.math.BigInteger;

public class Euler493 {

//	public static void main(String[] args) {
//		System.out.println((double)7*(1-(c(60,20)/c(70,20))));
//	}

	public static void main(String[] args) {
		System.out.println(E(20,0,70));
	}
	
	private static double E(double n, double p, double u) {
		if(n==0) return 0;
		else return (p/(p+u))*E(n-1,p-1,u)+(u/(p+u))*(1+E(n-1,p+9,u-10));
	}

	private static double c(int i, int j) {
		return	binomial(i, j).doubleValue();
	}
	
	// Returns n choose k.
		public static BigInteger binomial(int n, int k) {
			if (k < 0 || k > n)
				throw new IllegalArgumentException();
			BigInteger product = BigInteger.ONE;
			for (int i = 0; i < k; i++)
				product = product.multiply(BigInteger.valueOf(n - i));
			return product.divide(factorial(k));
		}
		
		public static BigInteger factorial(int n) {
			if (n < 0)
				throw new IllegalArgumentException("Factorial of negative number");
			BigInteger prod = BigInteger.ONE;
			for (int i = 2; i <= n; i++)
				prod = prod.multiply(BigInteger.valueOf(i));
			return prod;
		}

}
