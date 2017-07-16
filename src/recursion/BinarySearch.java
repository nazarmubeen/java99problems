package recursion;

public class BinarySearch {

	public static void main(String[] args)
	{
		int arr[] ={17,20,26,31,44,54,55,65,77,91,108,111};
		try {
			int index=binarySearchSolution(arr,111);
			System.out.println("index at "+ index);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}
	
	
	static int binarySearchSolution(int[] arr, int target) throws Exception
	{
		
		return binarySearch(arr,target,0,arr.length-1);
	}
	
	static int binarySearch(int[] arr, int target , int lower , int high) throws Exception
	{
		int range=high-lower;
		int center;
		
		if(range<0)
		{
			throw new Exception(" not a valid array");
		}
		
		if(arr[lower]>arr[high])
		{
			throw new Exception(" array is not sorted");
		}
		
		center=(range/2)+lower;
		if(target==arr[center])
		{
			return center;
		}
		else if(target<arr[center])
		{
			return binarySearch(arr,target,lower,center-1);
		}
		else{
			return binarySearch(arr,target,center+1,high);
		}
	
	}
	
}
