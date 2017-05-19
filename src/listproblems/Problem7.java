package listproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*	P07 (**) Flatten a nested list structure.
Example:
scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)*/

public class Problem7 {
	
	public static void main(String[] args)
	{
		
		ArrayList numbers=new ArrayList(Arrays.asList(Arrays.asList(1,1),  2, Arrays.asList(3, Arrays.asList(5, 8))));
		System.out.println("nested list "+numbers);
		System.out.println("after flatten operation"+flattenList(numbers));
		
	}
	
	public static List flattenList(ArrayList list)
	{
		ArrayList<Integer> integerlist=new ArrayList<Integer>();
		removeIntegers(list,integerlist);
		return integerlist;
	}
	
	public static void removeIntegers(List list,ArrayList<Integer> integerlist){
		for(Object i:list)
		{
			if(i.getClass().equals(Integer.class))
			{
				integerlist.add((Integer) (i));
			}
			else  {
			removeIntegers((List) i,integerlist);
			}	
		}
	}

}
