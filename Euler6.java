package Euler;

public class Euler6 {
	static int n=100;
	public static void main(String[] args) {
		int sum = 0;
		int sum2 = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			sum2 += i * i;
		}
		System.out.println(sum *sum-sum2);
	}
}
