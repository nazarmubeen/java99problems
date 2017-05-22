package graph;

import java.util.List;
import java.util.Stack;

public class DFSGraph {

	void dfsSearch(Graph g)
	{
		Stack<Vertex> stack=new Stack<>();
		
		stack.push(g.vertex.get(0));
		
		while(!stack.isEmpty())
		{
			System.out.println(stack.peek());
			List<Vertex> v=g.getNeigbours(stack.peek());
			stack.pop().visited=true;
			
			
			for(int i=v.size()-1;i>=0;i--)
			{
				if(v.get(i).visited==false)
				{
					
					stack.push(v.get(i));
				}
				
			}	
			
		}
		
		
	}
	
}
