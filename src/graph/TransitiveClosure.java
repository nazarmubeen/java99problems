package graph;

import java.util.List;
import java.util.Stack;

public class TransitiveClosure {
	int[][] closurematrix;
	
	void init(Graph g)
	{
		closurematrix=new int[g.vertexsize][g.vertexsize];
		
		for(int i=0;i<g.vertexsize;i++)
		{
			for(int j=0;j<g.vertexsize;j++)
			{
				closurematrix[i][j]=0;
			}
		}
		
		printmatrix(closurematrix,g.vertexsize);
	}
	
	void dfsSearchUtil(Graph g,Stack<Vertex> stack,Vertex source,int[][] closurematrix)
	{
		
		while(!stack.isEmpty())
		{
			
			System.out.println(stack.peek());
			List<Vertex> v=g.getNeigbours(stack.peek());
			stack.pop().visited=true;
	
			for(int i=v.size()-1;i>=0;i--)
			{
				if(closurematrix[source.data][v.get(i).data]==0)
				{
					closurematrix[source.data][v.get(i).data]=1;
					stack.push(v.get(i));
				}
				
			}	
			
		}
		
		
	}
	

	
	void dfs(Graph g)
	{

	init(g);
	System.out.println(" ");
	
	
	for(Vertex v:g.vertex)
	{
	Stack<Vertex> stack=new Stack<>();
	stack.push(v);	
	dfsSearchUtil(g, stack,v,closurematrix);
	makeAllNodeUnvisited(g);
	}
	
	
	System.out.println(" ");
	printmatrix(closurematrix,g.vertexsize);
	
	}
	
	
	void printmatrix(int[][] arr,int size){
		for(int i=0;i<size;i++)
		{
			System.out.println(" ");
			for(int j=0;j<size;j++)
			{
				System.out.print(" "+arr[i][j]);
			}
		}
	}
	
	void makeAllNodeUnvisited(Graph g)
	{
		for(Vertex v:g.vertex)
		{
		
			v.visited=false;
		
		}
	}
}
