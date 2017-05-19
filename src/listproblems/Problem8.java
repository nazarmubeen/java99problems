package listproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*P08 (**) Eliminate consecutive duplicates of list elements.
If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
Example:

scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
*/
public class Problem8 {

	public static void main(String[] args)
	{
		
		List<Character> characters=new ArrayList<>(Arrays.asList('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'));
		System.out.println("characters before "+characters);
		System.out.println("characters after "+compress(characters));
		
		
	}
	
	static List compress(List<Character> list)
	{
		
		int j=1;
		for (int i=1;i<list.size();i++)
		{
			if(list.get(i-1)==list.get(i))
			{
				continue;
			}	
			else{
			list.set(j, list.get(i));
			j++;
			}	
		}
		
		return list.subList(0,j);
		
	}
	
	
}
