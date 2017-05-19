package listproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Problem17_23 {

/*	P17 (*) Split a list into two parts.
	The length of the first part is given. Use a Tuple for your result.
	Example:

	scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
	res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
*/
	public static void main(String[] args)
	{
		
		List<Character> list=new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'));
		System.out.println("split the list with index "+split(3,list));
		System.out.println("extract slice from list "+extractSlice(3,6,list));
		System.out.println("rotate by 3"+ rotateList(list,3));
		System.out.println("rotate by -2"+ rotateList(list,-2));
		list=new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'));
		System.out.println("remove kth element "+ removeKthElement(list,1));
		System.out.println("add element to kth position "+ insertElementAtKposition(list,1,'b'));
		System.out.println("generate list with range 20-30"+generateListWithAGivenRange(20,30));
		System.out.println("random numbers");
		randomSelection(list, 3);
		
	}
	
	static List split(int index,List<Character> characters)
	{
		List newlist=new ArrayList<>();
		
		newlist.add(characters.subList(0, index));
		newlist.add(characters.subList(index+1,characters.size() ));
		
		
		
		return newlist;
	}

	/*P18 (**) Extract a slice from a list.
	Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.
	Example:

	scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
	res0: List[Symbol] = List('d, 'e, 'f, 'g)*/

	static List extractSlice(int start,int end,List<Character> characters)
	{
		return characters.subList(start, end);
	}

/*	P19 (**) Rotate a list N places to the left.
	Examples:
	scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
	res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)

	scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
	res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
*/
	
	static List rotateList(List<Character> characters,int n)
	{
		 Collections.rotate(characters, n);
		 return characters;
		
		
	}

/*	P20 (*) Remove the Kth element from a list.
	Return the list and the removed element in a Tuple. Elements are numbered from 0.
	Example:

	scala> removeAt(1, List('a, 'b, 'c, 'd))
	res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)*/

	static List removeKthElement(List<Character> characters,int k)
	{
		System.out.println(" ");
		System.out.println("symbol "+characters.get(k));
		characters.remove(k);
		return characters;
		
	}

	/*P21 (*) Insert an element at a given position into a list.
	Example:
	scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
	res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
*/
	static List insertElementAtKposition(List<Character> characters,int k,char element)
	{
		characters.add(k, element);
		
		return characters;
		
	}
	
	/*P22 (*) Create a list containing all integers within a given range.
	Example:
	scala> range(4, 9)
	res0: List[Int] = List(4, 5, 6, 7, 8, 9)
*/
	static List generateListWithAGivenRange(int start,int end)
	{
		Set<Integer> range= IntStream.rangeClosed(start, end).boxed()
        .collect(Collectors.toSet());
		List<Integer> characters=new ArrayList<>();
		for(int i:range)
		{
			characters.add(i);
		}
		
		return characters;	
	}
	
/*	P23 (**) Extract a given number of randomly selected elements from a list.
	Example:
	scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
	res0: List[Symbol] = List('e, 'd, 'a)
	Hint: Use the solution to problem P20*/
	
	static void randomSelection(List<Character> characters,int k)
	{
		System.out.println(" ");
		while(k>0)
		{
		
		System.out.print(" "+characters.get(new Random().nextInt(characters.size())));
		k--;
		}
	}
	
}
