package Euler;

public class Euler1 {

	static int n=1000;
	static int ans=0;
	public static void main(String[] args) {
		for(int i=1;i<n;i++)
		{
			if(i%3==0||i%5==0)
			{
				ans+=i;
			}
		}
		System.out.println(ans);
	}

}
