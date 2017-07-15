package Euler;

import java.util.ArrayList;
import java.util.List;

public class Euler204 {
	static int limit=1000000000;
	static List<Integer> primes=toList(Library.listPrimality(100));
	public static void main(String[] args) {
		
		
		System.out.println(count(0,1));
	}
	
	private static int count(int primeIndex, long product) {
		if (primeIndex == primes.size())
			return product <= limit ? 1 : 0;
		else {
			int count = 0;
			while (product <= limit) {
				count += count(primeIndex + 1, product);
				product *= primes.get(primeIndex);
			}
			return count;
		}
	}
	
	private static List<Integer> toList(boolean[] listPrimality) {
		List<Integer> primes=new ArrayList<>();
		for (int i = 0; i < listPrimality.length; i++) {
			if(listPrimality[i])
				primes.add(i);
		}
		return primes;
	}

}
