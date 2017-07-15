package Euler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Library {

	public static boolean isPalindrome(String s) {
		return s.equals(new StringBuilder(s).reverse().toString());
	}
	
	public static long smallestFactor(long n) {
		if (n <= 1)
			throw new IllegalArgumentException();
		for (long i = 2, end = (long)(Math.sqrt(n)); i <= end; i++) {
			if (n % i == 0)
				return i;
		}
		return n;
	}
	
	public static BigInteger lcm(BigInteger x, BigInteger y) {
		return x.divide(x.gcd(y)).multiply(y);
	}

	public static boolean[] listPrimality(int n) {
		if (n < 0)
			throw new IllegalArgumentException("Negative array size");
		boolean[] result = new boolean[n + 1];
		if (n >= 2)
			result[2] = true;
		for (int i = 3; i <= n; i += 2)
			result[i] = true;
		// Sieve of Eratosthenes
		for (int i = 3, end = (int) Math.sqrt((double)n); i <= end; i += 2) {
			if (result[i]) {
				// Note: i * i does not overflow
				for (long j = i * i; j <= n; j += i << 1)
					result[(int)j] = false;
			}
		}
		return result;
	}
	
	public static List<Integer> listPrimes(boolean[] isPrime) {
		List<Integer> primes=new ArrayList<>();
		for (int i = 2; i < isPrime.length; i++) {
			if(isPrime[i])
				primes.add(i);
		}
		return primes;
	}
	
	public static int totient(int n) {
		if (n <= 0)
			throw new IllegalArgumentException("Totient of non-positive integer");
		int p = 1;
		for (int i = 2, end = (int) Math.sqrt(n); i <= end; i++) {  // Trial division
			if (n % i == 0) {  // Found a factor
				p *= i - 1;
				n /= i;
				while (n % i == 0) {
					p *= i;
					n /= i;
				}
				end = (int) Math.sqrt(n);
			}
		}
		if (n != 1)
			p *= n - 1;
		return p;
	}
}
