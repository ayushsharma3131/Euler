package Euler;

import java.math.BigInteger;

public class Euler5 {

	public static void main(String[] args) {
		BigInteger allLcm = BigInteger.ONE;
		for (int i = 1; i <= 20; i++)
			allLcm = Library.lcm(BigInteger.valueOf(i), allLcm);
		

		System.out.println(allLcm);

	}
}
