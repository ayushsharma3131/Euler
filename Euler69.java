package Euler;

public class Euler69 {

	static boolean[] isPrime=Library.listPrimality(1000000);

	public static void main(String[] args) {
		float maxOutput=0;
		int ans=0;
		for(int i=2;i<=1000000;i++)
		{
			float x= (float)i/phi(i);
			if(x>maxOutput)
			{
				maxOutput=x;
				ans=i;
			}
		}
		System.out.println(ans);
	}

	private static int phi(int n) {
		
		int p = 1;
		for (int i = 2, end = (int) Math.sqrt((double)n); i <= end; i++) {  // Trial division
			if (n % i == 0) {  // Found a factor
				p *= i - 1;
				n /= i;
				while (n % i == 0) {
					p *= i;
					n /= i;
				}
				end = (int) Math.sqrt((double)n);
			}
		}
		if (n != 1)
			p *= n - 1;
		return p;
	}

//	private static int phi(int n) {
//		if(isPrime[n])
//			return n-1;
//		int count=0;
//		for(int i=1;i<n;i++)
//		{
//			if(n%2==0 && i%2==0)
//				continue;
//			boolean flag=false;
//			for(int j=3;j<n;j+=2)
//			{
//				if(isPrime[j])
//				{
//					if(n%j==0 && i%j==0 )
//					{
//						flag=true;
//						break;
//					}
//				}
//			}
//			if(!flag)
//				count++;
//		}
//		return count;
//	}
	
	

}
