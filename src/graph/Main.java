package graph;

public class Main {

	public static void main(String[] args)
	{
		
		Graph g=new Graph();
		
		Vertex v1=new Vertex(0);
		Vertex v2=new Vertex(1);
		Vertex v3=new Vertex(2);
		Vertex v4=new Vertex(3);
		Vertex v5=new Vertex(4);
		
		g.addVertex(v1);
		g.addVertex(v2);
		g.addVertex(v3);
		g.addVertex(v4);
		g.addVertex(v5);
		
		g.addEdge(v1, v2);
		g.addEdge(v1, v5);
		g.addEdge(v2, v5);
		g.addEdge(v2, v3);
		g.addEdge(v2, v4);
		g.addEdge(v3, v2);
		g.addEdge(v3, v4);
		g.addEdge(v4, v5);
		g.addEdge(v4, v2);
		g.addEdge(v4, v3);
		g.addEdge(v5, v1);
		g.addEdge(v5, v2);
		g.addEdge(v5, v4);
		
		g.print();

		System.out.println(g.getNeigbours(v2));
	}
}
