package dynamic_programming;

import java.util.ArrayList;
import java.util.List;

public class MatrixChainMultiplication {

	public static void main(String[] args)
	{
		int[] matrix1={10,100};
		int[] matrix2={100,5};
		int[] matrix3={5,50};
		int[] matrix4={50,1};
		
		List<int[]> list=new ArrayList<int[]>();
		list.add(matrix1);
		list.add(matrix2);
		list.add(matrix3);
		list.add(matrix4);
		buildResultMatrix(list);
	}
	
	static void buildResultMatrix(List<int[]> matrix)
	{
		int[][] resultMatrix=new int[matrix.size()][matrix.size()];
		printItemArray(resultMatrix);
		
		int[] array={matrix.get(0)[0],matrix.get(1)[0],matrix.get(2)[0],matrix.get(3)[0]};
		
		System.out.println(" ");
		
		for(int i=0;i<matrix.size();i++)
		{
			for(int j=0;j<matrix.size();j++)
			{
				if(i==j)
				{
					resultMatrix[i][j]=0;
				}
				else{
					
			
					
					
				}
				
				
			}
		}
		
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
