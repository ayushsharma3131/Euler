package Euler;

public class Euler3 {
	static long n=600851475143L;
	static int ans=0;
	public static void main(String[] args) {
		while (true) {
			long p = Library.smallestFactor(n);
			if (p < n)
				n /= p;
			else
				{
				System.out.println(n);
				break;
				}
		}
		
	}
	

}
