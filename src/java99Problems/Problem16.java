package java99Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*P16 (**) Drop every Nth element from a list.
Example:
scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)*/
public class Problem16 {

	public static void main(String[] args)
	{
		List<Character> list=new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'));
		System.out.println("removing third element"+dropNthElement(3,list));
		
		
	}
	
	static List dropNthElement(int n, List<Character> list)
	{
		int index=n-1;
		
		while(index<list.size())
		{
			list.remove(list.get(index));
			index=index+n-1;
		}	

		return list;
	}
	
	
}
