package arithmaticproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
	
	 public static void main(String[] args) {
	       
		 	long max=0;
		 	long sum=0;
	        Scanner sc=new Scanner(System.in);
	        int startindex;
        	int lastindex;
        	int value;
	        int N=sc.nextInt();
	    //    ArrayList<Integer> arr=new ArrayList<Integer>(Collections.nCopies(N+1, 0));
	        
	        int[] arr=new int[N=1];
	        int M=sc.nextInt();
	        
	        for(int i=0;i<M;i++)
	        {
	        	
	        	startindex=sc.nextInt();
	        	lastindex=sc.nextInt();
	        	value=sc.nextInt();
	        	arr[startindex]=arr[startindex]+1;
	        	if(lastindex+1<=N)
	        	arr[lastindex+1]=arr[lastindex+1]-value;		
	        	 /*arr.set(startindex,arr.get(startindex)+value);
	        	 if(lastindex+1<=N)
	        	 arr.set(lastindex+1,arr.get(lastindex+1)-value);*/
	        }
	    
	 
	     /*   for(int i:arr)
	        {
	        	sum=sum+i;
	        	if(sum>max)
	        	{
	        		max=sum;
	        	}
	        }*/
	        
	        
	        
	        
	     System.out.println(max);
	    }
	 
	 

}
