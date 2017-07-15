package Euler;

public class Euler2 {

	static int x=1;
	static int y=2;
	static int ans=0;
	public static void main(String[] args) {
		while(x<=4000000)
		{
			if(x%2==0)
			{
				ans+=x;
			}
			int z=x+y;
			x=y;
			y=z;
		}
		System.out.println(ans);
	}

}
