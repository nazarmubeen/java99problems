package java99Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*P09 (**) Pack consecutive duplicates of list elements into sublists.
If a list contains repeated elements they should be placed in separate sublists.
Example:

scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
*/

public class Problem9_10 {

	public static void main(String[] args)
	{
		List<Character> characters=new ArrayList<>(Arrays.asList('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'));
		System.out.println("characters before "+characters);
		System.out.println("run length encoding is "+ runLengthEncoding(characters));
		System.out.println("characters after "+packConsecutiveDuplicates(characters));	
		System.out.println("run length encoding by sequence is "+runLengthEncodingSequence(packConsecutiveDuplicates(characters)));
	}
	

	static List packConsecutiveDuplicates(List<Character> list)
	{
		
		List<Character> innerlist=new ArrayList<>();
		List mainlist=new ArrayList<>();
		innerlist.add(list.get(0));
		
		for (int i=1;i<list.size();i++)
		{
		
			if(list.get(i-1)==list.get(i))
			{	
				innerlist.add(list.get(i));
				continue;
			}	
			else{
				mainlist.add(innerlist);
				innerlist=new ArrayList<>();
				innerlist.add(list.get(i));
		
			}	
			
	
		}
		mainlist.add(innerlist);
		return mainlist;
		
	}
	
	/*P10 (*) Run-length encoding of a list.*/
	static HashMap runLengthEncoding(List<Character> list){
		
		HashMap<Character,Integer> map=new HashMap<>();
		
		for(char a:list)
		{
		if(map.get(a)==null)
		{
			map.put(a, 1);
		}
		else{
			map.put(a, map.get(a)+1);
		}
		
		
	}
		return map;
	
	}
	
	/*P10 (*) Run-length encoding of a list as sequencewise.*/
	static ArrayList runLengthEncodingSequence(List<List>  lists){
		
		ArrayList encodinglist=new ArrayList<>();
		
		for(List a: lists)
		{
			ArrayList encodinglistinner=new ArrayList<>();
			encodinglistinner.add(a.size());
			encodinglistinner.add(a.get(0));
			encodinglist.add(encodinglistinner);
		}
		return encodinglist;
	
	}
}

