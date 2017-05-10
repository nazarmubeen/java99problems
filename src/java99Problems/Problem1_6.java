package java99Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Problem1_6 {
	
	public static void main(String[] args)
	{
		
		//creating lists
		List<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,1,2,3,5,8));
		System.out.println("Last Element = "+lastElement(numbers));
		System.out.println("last but one element = "+lastbutOneElement(numbers));
		System.out.println("kth element = "+kthElement(numbers,2));
		System.out.println("size of list = "+sizeOfList(numbers));
		System.out.println("rverse of list is = "+reverseList(numbers));
		ArrayList<Integer> arraynumbers=new ArrayList<Integer>(Arrays.asList(1,1,2,3,5,8));
		System.out.println("rverse of list using collection = "+reverseListByCollection(arraynumbers));
		List<Integer> numbers1=new ArrayList<Integer>(Arrays.asList(1,1,2,3,5,8));
		System.out.println("is palindrome= "+isPallindrome(numbers1));
		List<Integer> pallindromenumbers1=new ArrayList<Integer>(Arrays.asList(1,2,3,5,3,2,1));
		List<Integer> pallindromenumbers2=new ArrayList<Integer>(Arrays.asList(1,2,3,3,2,1));
		System.out.println("is palindrome numbers1= "+isPallindrome(pallindromenumbers1));
		System.out.println("is palindrome numbers2= "+isPallindrome(pallindromenumbers2));
	}
	
	/*//P01 (*) Find the last element of a list.
	Example:
	scala> last(List(1, 1, 2, 3, 5, 8))
	res0: Int = 8*/
	
	public static int lastElement(List list){
		return (int) list.get(list.size()-1);
	}

	/*02(*) Find the last but one element of a list.
	Example:
	scala> penultimate(List(1, 1, 2, 3, 5, 8))
	res0: Int = 5*/
	
	public static int lastbutOneElement(List list){
		return (int) list.get(list.size()-2);
	}
	
	/*03(*) Find the Kth element of a list.
	By convention, the first element in the list is element 0.
	Example:

	scala> nth(2, List(1, 1, 2, 3, 5, 8))
	res0: Int = 2*/
	
	public static int kthElement(List list,int k){
		return (int) list.get(k);
	}
	
	/*P04 (*) Find the number of elements of a list.
	Example:
	scala> length(List(1, 1, 2, 3, 5, 8))
	res0: Int = 6*/
	
	public static int sizeOfList(List list){
		return list.size();
	}
	
	/*P05 (*) Reverse a list.
	Example:
	scala> reverse(List(1, 1, 2, 3, 5, 8))
	res0: List[Int] = List(8, 5, 3, 2, 1, 1)
	*/
	
	//method 1
	public static List reverseList(List<Integer> list){
		
		Object[] numbers=list.toArray();
		
		for(int i=numbers.length-1;i>=0;i--)
		{
			list.set(numbers.length-(i+1), (Integer) numbers[i]);
		}
			
		return list;
	}
	//method 2 using collection only works on defined collection not simple List Interface
		public static List reverseListByCollection(List<Integer> list){
			Collections.reverse(list);
			return list;
		}
	
		/*P06 (*) Find out whether a list is a palindrome.
		Example:
		scala> isPalindrome(List(1, 2, 3, 2, 1))
		res0: Boolean = true*/
	
		public static boolean isPallindrome(List<Integer> list){
			boolean result=true;
			int size=list.size();
			for(int i=0;i<size/2;i++)
			{
				if(list.get(i)!=list.get(size-(i+1)))
				{
					return false;
				}
			}
			return result;
		}
	

}
