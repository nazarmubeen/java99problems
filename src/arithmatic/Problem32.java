package arithmatic;


/*P32 (**) Determine the greatest common divisor of two positive integer numbers.
Use Euclid's algorithm.
scala> gcd(36, 63)
res0: Int = 9*/
public class Problem32 {

	
	public static void main(String[] args)
	{
		System.out.println(greatestCommonDivisor(36,63));
		System.out.println(findGCD(36,63));
		System.out.println("is 35 coprime 64"+findCoPrime(35,64));
	}
	
	//iteration
	static int  greatestCommonDivisor(int a,int b)
	{
		int gcd=0;
		
		if(a%b==0)
			return a;
		if(b%a==0)
			return b;
		
		for(int i=1;i<(a>b?b:a);i++)
		{
			if(a%i ==0 && b%i==0 && i>gcd)
			{
				gcd=i;
			}
		}
		
		return gcd;
	}
	
	//recursion
	 static int findGCD(int a, int b) { 
		System.out.println("a = "+a+" b= "+b);
		if(b == 0)
		{ 
			return a; 
		} 
		return findGCD(b, a%b);
		}


/*
P33 (*) Determine whether two positive integer numbers are coprime.
Two numbers are coprime if their greatest common divisor equals 1.
scala> 35.isCoprimeTo(64)
res0: Boolean = true*/
	 static boolean findCoPrime(int a , int b)
		{
			
			return (Problem32.findGCD(a, b)==1);
			
			
		}
}
