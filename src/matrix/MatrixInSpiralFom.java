package matrix;

public class MatrixInSpiralFom {

	public static void main(String[] args)
	{
		
		
	   int[][] a={{1 ,   2 ,  3 ,  4, 17},
		        {5  ,  6 ,  7 ,  8, 18},
		        {9   ,10 , 11  ,12, 19},
		        {13 , 14,  15,  16, 20},
		        {21, 22,  23,  24, 25}};
	   System.out.println("length ="+a.length);
		print(a);
		printInSpiral(a);
	}
	
	
	static void printInSpiral(int[][] a){
	
	
		int i,n=a.length,m=a.length,r=m-1,q=n-1;
        while(q>0 && r>0){
            System.out.println(" ");
            for(i=m-1-r;i<=r;i++){
                System.out.print(" "+ a[m-1-r][i]);
            }
            System.out.println(" ");
            for(i=n-1-q+1;i<=q;i++){
                System.out.print(" "+ a[i][r]);
            }
            System.out.println(" ");
            for(i=r-1;i>=m-1-r && q>1;i--){
                System.out.print(" "+ a[q][i]);
            }
            System.out.println(" ");
            for(i=q-1;i>=n-1-q+1 && r>1;i--){
                System.out.print(" "+ a[i][n-1-q]);
            }
            q--;
            r--;
        }
		
	}
	
	
	static void print(int[][] a)
	{
		System.out.println(" ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(" ");
			for(int j=0;j<a.length;j++)
			{
				System.out.print(" "+a[i][j]);
			}
		}
	}
}
