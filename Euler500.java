package Euler;

import java.util.TreeSet;

public class Euler500 {

	static TreeSet<Integer> s= new TreeSet<Integer>();
	static boolean[]isPrime=Library.listPrimality(10000000);
	public static void main(String[] args) {
		for (int i = 0; i < isPrime.length; i++) 
		{
			if(isPrime[i])
			{
				s.add(i);
				if(i<=3000)
					s.add(i*i);
				if(i<=50)
					s.add(i*i*i*i);
				if(i<=8)
					s.add(i*i*i*i*i*i*i*i);
				if(i<=3)
					s.add(i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i);
				
			}
		}
		
		long ans=1;
		int count=500500;
		System.out.println(s.size());
		for(int i:s)
		{
			if(count--==0)
				break;
			ans*=i;
			ans%=500500507;
		}
		System.out.println(ans);
	}

}
