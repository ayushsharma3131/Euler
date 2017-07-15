package Euler;

import java.util.List;

public class Euler123 {
	static List<Integer> primes=Library.listPrimes(Library.listPrimality(1000000));
	private static long THRESHOLD=10000000000l;
	public static void main(String[] args) {
		System.out.println(primes.size());
		for (int n = 5; n <= primes.size(); n+=2) {
			
			long rem = (long)(n) * primes.get(n-1) * 2;
			if (rem > THRESHOLD)
				{
				System.out.println(n);
				break;
				}
		}
	}

}
