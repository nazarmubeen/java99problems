package arithmaticproblems;

/*P31 (**) Determine whether a given integer number is prime.
scala> 7.isPrime
res0: Boolean = true*/
public class Problem31 {

	public static void main(String[] args)
	{
		findPrimeRange(30);
	}
	
	static void findPrimeRange(int range)
	{
		for(int i=0;i<=range;i++)
		{
			System.out.println("no "+i+" is prime "+isPrime(i));
		}
	}
	
	static boolean isPrime(int n)
	{
		for(int i=2;i<n-1;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
