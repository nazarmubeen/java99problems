package dynamic_programming;

public class LongestCommonSubsequence {

	public static void main(String[] args)
	{
		String a="abcdef";
		String b="acecf";
		buildMatrix(a,b);
	}
	
	static void buildMatrix(String a,String b)
	{
		System.out.println( a.length() +" "+b.length());
		int[][] matrix=new int[b.length()][a.length()];

		System.out.println(" ");
		
		for(int i=0;i<b.length();i++)
		{
			for(int j=0;j<a.length();j++)
			{
				
				if(a.charAt(j)==b.charAt(i))
				{
				if(i>0 && j>0)
				matrix[i][j]=matrix[i-1][j-1]+1;
				else{
					matrix[i][j]=1;
				}
				
				}
				else{
					if(i>0 && j>0)
					{
					matrix[i][j]=Math.max(matrix[i][j-1],matrix[i-1][j]);
					}
					else{
						if(i>0)
						{
							matrix[i][j]=matrix[i-1][j];
						}
						else if(j>0)
						{
							matrix[i][j]=matrix[i][j-1];
						}
					}
				}
				
			}
			
		}
		
	
		printItemArray(matrix);
		gettingSequence(matrix,a,b);
	}
	
	
	
	static StringBuffer gettingSequence(int[][] matrix,String a,String b)
	{
		StringBuffer sequence=new StringBuffer();
		
		int i=matrix.length-1;
		int j=matrix[0].length-1;
		System.out.println(" i "+i + "j "+j);
		while(i>0 && j>0){
	
			System.out.println(" i "+i + "j "+j);
			if((matrix[i][j]==matrix[i-1][j-1]+1))
			{
				System.out.println("true");
				sequence.append(a.charAt(j));
				i--;
				j--;
			}
			else if(matrix[i][j]==matrix[i-1][j] )
			{
				j--;
				
			}
			else if(matrix[i][j]==matrix[i][j-1])
			{
			j--;
			}
		
			
		}
		
		System.out.println("sequence "+sequence);
		return sequence;
		
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
