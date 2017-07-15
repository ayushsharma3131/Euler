package Euler;

public class Euler205 {

	public static void main(String[] args) {
		double r = 0.0;
		  for(int p = 9; p <= 36; p++){
		    for(int c = 6; c < 36; c++){
		      if(c < p){
		        r += colin(c)*peter(p);
		      }
		    }
		  }
		  System.out.println(r);
	}
	
	static double colin(int n)
	{
	  int t = 0;
	  for(int d1 = 1; d1<7; d1++)
	  for(int d2 = 1; d2<7; d2++)
	  for(int d3 = 1; d3<7; d3++)
	  for(int d4 = 1; d4<7; d4++)
	  for(int d5 = 1; d5<7; d5++)
	  for(int d6 = 1; d6<7; d6++)
	  if(d1+d2+d3+d4+d5+d6 == n)
	  t++;
	  return ((double)t)/(6*6*6l*6*6*6);
	}
	
	static double peter(int n)
	{
	  int t = 0;
	  for(int d1 = 1; d1<5; d1++)
	  for(int d2 = 1; d2<5; d2++)
	  for(int d3 = 1; d3<5; d3++)
	  for(int d4 = 1; d4<5; d4++)
		  for(int d5 = 1; d5<5; d5++)
			  for(int d6 = 1; d6<5; d6++)
			  for(int d7 = 1; d7<5; d7++)
			  for(int d8 = 1; d8<5; d8++)
				  for(int d9 = 1; d9<5; d9++)
	  if(d1+d2+d3+d4+d5+d6+d7+d8+d9 == n)
	  t++;
	  return ((double)t)/(4*4*4*4*4*4l*4*4*4);
	}

}
