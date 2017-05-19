package listproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

public class Problem9 {

	public static void main(String[] args)
	{
		List<Character> characters=new ArrayList<>(Arrays.asList('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'));
		System.out.println("characters before "+characters);
		System.out.println("run length encoding is "+ runLengthEncoding(characters));
		System.out.println("characters after "+packConsecutiveDuplicates(characters));	
		System.out.println("run length encoding by sequence is "+runLengthEncodingSequence(packConsecutiveDuplicates(characters)));
		System.out.println("run length encoding by sequence is "+runLengthEncodingSequenceDuplicate(packConsecutiveDuplicates(characters)));
		System.out.println("duplicate elements of a list "+DuplicateElements(characters));
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
	
	/*P11 (*) Modified run-length encoding.
	Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.
	Example:

	scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
	res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))*/
	
	/*P10 (*) Run-length encoding of a list as sequencewise.*/
	static ArrayList runLengthEncodingSequenceDuplicate(List<List>  lists){
		
		ArrayList encodinglist=new ArrayList<>();
		
		for(List a: lists)
		{
			if(a.size()==1)
			{
				encodinglist.add(a.get(0));
			}
			else{
			ArrayList encodinglistinner=new ArrayList<>();
			encodinglistinner.add(a.size());
			encodinglistinner.add(a.get(0));
			encodinglist.add(encodinglistinner);
		
			}
		}
		return encodinglist;
	
	}
	
/*	P12,P13 is same as previous starting with 
 * P14 (*) Duplicate the elements of a list.
	Example:
	scala> duplicate(List('a, 'b, 'c, 'c, 'd,e))
	res0: List[Symbol] = [[a, a], [a, a], [a, a], [a, a], [b, b], [c, c], [c, c], [a, a], [a, a], [d, d], [e, e], [e, e], [e, e], [e, e]]*/

	
	static List DuplicateElements(List<Character> characters){
		List newlist=new ArrayList<>();
		for(char c:characters)
		{
			newlist.add(Collections.nCopies(2,c ));
	
		}
	System.out.println(newlist);
	return newlist;
	}
	
	
}

