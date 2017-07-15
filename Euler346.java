package Euler;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Euler346 {
	//static Map<BigInteger,Integer> repunits=new HashMap<>();
	 static int[][] repunits=new int[1000000][1000000];
	static long start=System.currentTimeMillis();
	public static void main(String[] args) {
		BigInteger limit=new BigInteger("1000000000000");
		for(long i=2;i<limit.longValue()-1;i++)
		{
			BigInteger x=BigInteger.ONE;
			BigInteger p=BigInteger.ONE;
			while(true)
			{
				p=p.multiply(new BigInteger(i+""));
				x=x.add(p);
				if(x.compareTo(limit)<0)
				{
					int a=x.divide(new BigInteger("1000000")).intValue();
					int b=x.mod(new BigInteger("1000000")).intValue();
					repunits[a][b]++;
				}
				else break;
			}
			
		}
		
		//Set<Entry<BigInteger,Integer>> entrySet=repunits.entrySet();
		//System.out.println(entrySet.size());
		BigInteger ans=BigInteger.ONE;
//		for(Entry<BigInteger,Integer> entry:entrySet)
//		{
//			if(entry.getValue()==2)
//				{
//				System.out.println(entry.getKey());
//				ans=ans.add(entry.getKey());
//				}
//		}
		for (int i = 0; i < repunits.length; i++) {
			for (int j = 0; j < repunits[i].length; j++) {
			if(repunits[i][j]>1)
				{
				long x=(long)i*1000000+j;
				ans=ans.add(new BigInteger(x+""));
				}
			}
		}
		System.out.println(ans);
		System.out.println(System.currentTimeMillis()-start);
	}
	
}
