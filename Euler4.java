package Euler;

public class Euler4 {
	static int n=1000;
	static int ans=0;
	public static void main(String[] args) {
		int maxPalin = -1;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int prod = i * j;
				if (Library.isPalindrome(String.valueOf(prod)) && prod > maxPalin)
					maxPalin = prod;
			}
		}
		System.out.println(maxPalin);
	}
	

}
