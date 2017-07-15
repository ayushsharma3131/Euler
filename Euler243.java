package Euler;

public class Euler243 {
	public static void main(String[] args) {
		boolean isPrime[]=Library.listPrimality(10000);
		System.out.println(15499/94744d);
		int x=1;
		for(int i=2;i<29;i++)
		{
			if(isPrime[i])
			{
				x*=i;
				System.out.println((double)resilience(x)/(x-1));
			}
			
		}
		
		System.out.println(x);
		for(int i=4;i<isPrime.length;i++)
		{
			if(!isPrime[i])
			{
				int n=x;
				n*=i;
				if((double)resilience(n)/(n-1)<15499/94744d)
					{
						System.out.println(n);
						break;
					}
			}
			
		}
//		for(int i=890000000;i<Integer.MAX_VALUE;i++)
//		{
//			if((double)resilience(i)/(i-1)<x)
//			{
//				System.out.println(i);
//				break;
//			}
//		}
	}

	private static int resilience(int i) {
		
		return Library.totient(i);
	}
}
