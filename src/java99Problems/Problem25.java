package java99Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem25 {

	
/*	P25 (*) Generate a random permutation of the elements of a list.
	Hint: Use the solution of problem P23.
	Example:

	scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
	res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)*/
	
	public static void main(String[] args)
	{
		
		
		List characters=new ArrayList<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'));
		randomPermute(characters);

	}
	
	static void randomPermute(List list)
	{
		int i=list.size();
		while(i>0)
		{
	Problem17_23.randomSelection(list,list.size());
		i--;
		}
	}
	
	
	
	
	
	
	
}
