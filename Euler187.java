package Euler;

import Euler.Library;
import java.util.List;

public class Euler187 {

	public static void main(String[] args) {
		List<Integer> primes=Library.listPrimes(Library.listPrimality(50000000));
		long count=0;
		for(int i=0;i<primes.size();i++)
		{
			for(int j=i;j<primes.size();j++)
			{
				long x=(long)primes.get(i)*primes.get(j);
				if(x>100000000l)
					break;
				count++;
			}
		}
		
		System.out.println(count);
	}

}
