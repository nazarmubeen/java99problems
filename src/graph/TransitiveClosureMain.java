package graph;

public class TransitiveClosureMain {

	public static void main(String[] args)
	{
		Graph g=new Graph();
		Vertex v0=new Vertex(0);
		Vertex v1=new Vertex(1);
		Vertex v2=new Vertex(2);
		Vertex v3=new Vertex(3);
		
		
		g.addVertex(v0);
		g.addVertex(v2);
		g.addVertex(v1);
		g.addVertex(v3);
		
		g.addEdge(v0, v2);
		g.addEdge(v0, v1);
		g.addEdge(v1, v2);
		g.addEdge(v2, v0);
		g.addEdge(v2, v3);
		g.addEdge(v3, v3);
		
		TransitiveClosure tc=new TransitiveClosure();
		tc.dfs(g);
		
		
		
	}
}
