package Euler;

public class Euler549 {


	//smp[i] is the smallest prime divisor of i. 
	//Example: smp[10] = 2, smp[7] = 7
	static int[] smp;


	//calculate the highest power of prime that divides n! 
	//example: count(6, 2) = 4 as 6! = 720 mod (2 ^ 4) = 0
	//but  (2^5) = 32 not divides 720
	static int countPrimeFactor(int n, int prime ){
	    return n<prime? 0 : n/prime + countPrimeFactor(n/prime, prime);
	}

	//calculation to find smp array. The basic is as sieve of Erathones but with some difference to find the smallest non-trivial factor of a number
	static int[] sieveModified(int n){
	    int[] factor = new int[n+1];
	    
	    for (int i = 2; i <= n; i++) 
	        if(factor[i] == 0){
	            factor[i] = i;
	            if( (long) i*i <= n)
	                for (int j = i*i; j <= n; j += i) 
	                    if(factor[j] == 0)
	                        factor[j] = i;

	        }
	    return factor;
	}

	//calculate S(N) as mentioned
	static int smallestFactotialDivide(int n){
	    int ans = 1;
	    while(n>1){
	        int prime = smp[n];
	        int c = 0;
	        while( n % prime == 0){
	            n /= prime;
	            c++;
	        }

	        while(countPrimeFactor(ans, prime) < c){
	            ans += prime - ans%prime;
	        }
	    }

	    return ans;
	}

	static long divisibilityOfFactorials(int N) {

	    smp = sieveModified(N);
	    long S = 0;
	    for (int i = 2; i <= N; i++) 
	        S+=smallestFactotialDivide(i);
	    
	    return S;
	}

	public static void main(String[] args) {
		System.out.println(divisibilityOfFactorials(100000000));
	}

}
