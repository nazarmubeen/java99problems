package graph;

public class TopologicalGraph {

	public static void main(String[] args)
	{
		Graph g=new Graph();
		Vertex v0=new Vertex(0);
		Vertex v1=new Vertex(1);
		Vertex v2=new Vertex(2);
		Vertex v3=new Vertex(3);
		Vertex v4=new Vertex(4);
		Vertex v5=new Vertex(5);
		
		g.addVertex(v5);
		g.addVertex(v0);
		g.addVertex(v2);
		g.addVertex(v3);
		g.addVertex(v1);
		g.addVertex(v4);
		
	
		g.addEdge(v5, v0);
		g.addEdge(v5, v2);
		g.addEdge(v2, v3);
		g.addEdge(v3, v1);
		g.addEdge(v4, v0);
		g.addEdge(v4, v1);
		
		g.print();
		
		TopologicalSorting t=new TopologicalSorting();
		t.topologicalSorting(g);
	}
}
