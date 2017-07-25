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
		int[][] matrix=new int[b.length()+1][a.length()+1];

		System.out.println(" ");
		
		for(int i=0;i<=b.length();i++)
		{
			for(int j=0;j<=a.length();j++)
			{
				if(i==0 || j==0)
				{
					matrix[i][j]=0;
					
				}
				
				else if(a.charAt(j-1)==b.charAt(i-1))
				{
				matrix[i][j]=matrix[i-1][j-1]+1;
				}
				else{
					matrix[i][j]=Math.max(matrix[i][j-1],matrix[i-1][j]);
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


		
		while(i>0 && j>0){
	
			int top=matrix[i-1][j];
			int left=matrix[i][j-1];
			
			if((matrix[i][j]==top || matrix[i][j]==left))
			{
				int move=Math.max(top, left)==top?i--:j--;
			}
			else{		
				sequence.append(a.charAt(j-1));
				i--;
				j--;
			}
		
			
		}
		System.out.println(" ");
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
