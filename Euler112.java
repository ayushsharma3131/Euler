package Euler;

public class Euler112 {

	public static void main(String[] args) {
		int count=0;
		for(int i=100;;i++)
		{
			if(isBouncy(i))
				count++;
			if((count*100)/i>=99)
				{
				System.out.println(i);
				break;
				}
		}
	}

	private static boolean isBouncy(int i) {
		return !isIncreasing(Integer.toString(i))&&!isDecreasing(Integer.toString(i));
	}

	private static boolean isDecreasing(String string) {
		char a=string.charAt(0);
		for(int i=1;i<string.length();i++)
			{
			if(string.charAt(i)>a)
				return false;
			a=string.charAt(i);
			}
		return true;
	}

	private static boolean isIncreasing(String string) {
		char a=string.charAt(0);
		for(int i=1;i<string.length();i++)
			{
			if(string.charAt(i)<a)
				return false;
			a=string.charAt(i);
			}
		return true;
	}

}
