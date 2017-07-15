package Euler;

public class Euler120 {

	public static void main(String[] args) {
		int sum = 0;
		for (int a = 3; a <= 1000; a++)
			sum += a * (a - (a % 2 == 0 ? 2 : 1));
		System.out.println(sum);
	}

}
