package arithmaticproblems;

import java.util.ArrayList;

/*P35 (**) Determine the prime factors of a given positive integer.
Construct a flat list containing the prime factors in ascending order.
scala> 315.primeFactors
res0: List[Int] = List(3, 3, 5, 7)*/
public class Problem35 {

	public static void main(String[] args){
		
		System.out.println(primefactors(315));
		
	}
	
	static ArrayList<Integer> primefactors(int range)
	{
		ArrayList<Integer> primelist=new ArrayList<>();
		int i=2;
		while(range!=1)
		{
			if (range%i==0 && Problem31.isPrime(i))
			{
				System.out.println("i ="+i);
					while(range%i==0)
					{
						range=range/i;
						primelist.add(i);	
					}
			}
			i++;
		}
		
		return primelist;
		
	}
	
	
}
