package dynamic_programming;

import java.util.ArrayList;

public class KnapsackProblem {

	public static void main(String[] args)
	{
		
		int[][] items={{1,1},{3,4},{4,5},{5,7}};

		printItemArray(items);
		buildMatrix(items,7);
	}
	

	
	
	static void buildMatrix(int[][] items,int maxWeight)
	{
		int[][] weightmatrix=new int[items.length][maxWeight+1];
		fillMatrix(items,weightmatrix);
		printItemArray(weightmatrix);
	}
	
	static int  fillMatrix(int[][] items,int[][] matrix)
	{
		int maxValue=0;
		for(int itemNumber=0;itemNumber<matrix.length;itemNumber++)
		{
			for(int currentWeight=0;currentWeight<matrix[itemNumber].length;currentWeight++)
			{
				
				int weightvalue=items[itemNumber][0];
				
				if(currentWeight<weightvalue)
				{
					if(itemNumber-1>=0)
					{
						matrix[itemNumber][currentWeight]=matrix[itemNumber-1][currentWeight];
					}
					else{
						matrix[itemNumber][currentWeight]=0;
					}
				}
				else{
					if(itemNumber-1>=0)
					matrix[itemNumber][currentWeight]=Math.max(matrix[itemNumber-1][currentWeight], items[itemNumber][1]+matrix[itemNumber-1][currentWeight-weightvalue]);
					else{
						matrix[itemNumber][currentWeight]=items[itemNumber][1];
					}
				}
				if(matrix[itemNumber][currentWeight]>maxValue)
				{
					maxValue=matrix[itemNumber][currentWeight];
				}
			}
			
		
			
		}
		System.out.println(" ");
		System.out.println("maxValue"+maxValue);
		return maxValue;
	}
	
	
	static ArrayList<Integer> printItemsForMaxValue(int[][] matrix,int index)
	{
		ArrayList<Integer> list=null;
		
		
		
		
		
		return list;
	}
	
	
	static void printItemArray(int[][] items)
	{
		for(int i=0;i<items.length;i++)
		{
			System.out.println(" ");
			for(int j=0;j<items[i].length;j++)
			{
				System.out.print(" "+items[i][j]);
			}
		}
	}
}
