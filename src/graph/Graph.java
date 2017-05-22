package graph;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Graph {
	
	List<Vertex> vertex;
	int vertexsize;
	LinkedHashMap<Integer,List<Vertex>> edges;
	
	
	public Graph()
	{
		vertex=new ArrayList<>();
		vertexsize=0;
		edges=new LinkedHashMap<>();
	}
	
	
	int addVertex(Vertex a)
	{
		List<Vertex> neighbours=new LinkedList<>();
		vertex.add(a);
		edges.put(a.data, neighbours);
		this.vertexsize++;
		return vertexsize;
	}
	
	int removeVertex(Vertex a)
	{
		vertex.remove(a);
		edges.remove(a.data);
		this.vertexsize--;
		return vertexsize;
	}
	
	boolean addEdge(Vertex a,Vertex b)
	{
		
		edges.get(a.data).add(b);
		return true;
	}
	
	boolean addEdge(Vertex a,List<Vertex> b)
	{
		
		edges.get(a).addAll(b);
		return true;
	}
	
	boolean removeEdge(Vertex a,Vertex b)
	{
		
		edges.get(a.data).remove(b);
		return true;
	}
	
	
	List<Vertex> getNeigbours(Vertex v)
	{
		return edges.get(v.data);
	}
	
	void print()
	{
		Set<Integer> v=edges.keySet();
		
		for(int a:v)
		{
			System.out.println(a + " " +edges.get(a).toString());
		}
		
	}
}
