package graph;

import java.util.List;
import java.util.Stack;

public class TopologicalSorting {

	void topsorting(Graph g,Vertex source,Stack<Vertex> stack)
	{
		
		List<Vertex> vertexlist=g.getNeigbours(source);
	
		for(Vertex v:vertexlist)
		{
			topsorting(g,v,stack);
		}
		
		if(source.visited==false)
		{
		System.out.println("data push"+source.data);
		source.visited=true;
		stack.push(source);
		}
		
		
	}
	
	void topologicalSorting(Graph g)
	{
		Stack<Vertex> stack=new Stack<>();
		for(Vertex v:g.vertex)
		{
			
			if(v.visited==false)
			{
				topsorting(g,v,stack);
			}
			
		}
		
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
		
		
	}
	
}
