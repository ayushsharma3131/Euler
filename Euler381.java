package Euler;

import java.math.BigInteger;

public class Euler381 {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		boolean[] isPrime = Library.listPrimality(100000000);
		long sum = 0;
		for (int i = 5; i < isPrime.length; i++) {
			if (isPrime[i])
				sum += s(i);
			
		}
		System.out.println(sum);
		System.out.println(System.currentTimeMillis()-start);
	}
	
	private static int s(int p) {
		int ans=(int)((long)(p - 3) * reciprocalMod(8 % p, p) % p);
		return ans;
	}

	
	
	public static int reciprocalMod(int x, int m) {
		BigInteger ans=new BigInteger(x+"");
		ans=ans.modInverse(new BigInteger(m+""));
		return ans.intValueExact();
	}

}
