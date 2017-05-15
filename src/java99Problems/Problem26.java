package java99Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Problem26 {
	
	//solution is still in progress

/*	P26 (**) Generate the combinations of K distinct objects chosen from the N
 *  elements of a list.
	In how many ways can a committee of 3 be chosen from a group of 12 people?
	 We all know that there are C(12,3) = 220 possibilities (C(N,K)
	 denotes the well-known binomial coefficient).
	  For pure mathematicians, this result may be great.
	   But we want to really generate all the possibilities.
	Example:

	scala> combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
	res0: List[List[Symbol]] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), ...
	*/
	
	/*
	 * in this case it will will be 6c3 =20 cases
	 * 
	 * a b c
	 * a b d
	 * a b e
	 * a b f
	 * a c d
	 * a c e
	 * a c f
	 * a d e
	 * a d f
	 * a e f
	 * 
	 * b c d
	 * b c e
	 * b c f
	 * b d e
	 * b d f
	 * b e f
	 * 
	 * c d e
	 * c d f
	 * c e f
	 * 
	 * d e f
	 */
	
	
	public static void main(String[] args)
	{
		List characters=new ArrayList<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'));
		
		System.out.println(combination(characters,3));
		
		
	
	}
	
	static List combination(List<Character> list,int k)
	{
		List combos=new ArrayList<>();
		
		List combo=new ArrayList<>();
		for(int i=list.size();i>k-1;i--)
		{
			combos=generatePatttern(list.subList(0, i),k);	
			combo.add(combos);
		}
	
		return combo;
	}
	
	static List generatePatttern(List<Character> list,int k)
	{
	
		List subcombos=new ArrayList<>();
		int c=list.size()-1;
		while(c>1)
		{
		List<Character> subcombo=new ArrayList<>();
		List subcombomerge = null;
		subcombo.add(list.get(list.size()-1));
		for(int b=1;b<k-1;b++)
		{
		subcombo.add(list.get(c-b));
		}
		System.out.println("subcombo = "+subcombo);
		for(int i=0;i<list.indexOf(subcombo.get(subcombo.size()-1));i++)
		{
			subcombomerge=new ArrayList();
			subcombomerge.addAll(subcombo);
			subcombomerge.add(list.get(i));
			subcombos.add(subcombomerge);
		}
		
		c--;
		}
		
		return subcombos;
	}
	
	

	
	
}

