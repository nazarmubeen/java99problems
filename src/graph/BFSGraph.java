package graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSGraph {
	
	
	void bfsSearch(Graph g)
	{
		Queue<Vertex> q=new LinkedList<>();
		q.add(g.vertex.get(0));
		
		while(!q.isEmpty())
		{
			q.peek().visited=true;
			System.out.println(q.peek());
			List<Vertex> neighbour=g.getNeigbours(q.poll());
			
			for(Vertex v:neighbour)
			{
				if(v.visited==false)
				{
					q.add(v);
				}
				
			}
			
		}
		
	}

}
