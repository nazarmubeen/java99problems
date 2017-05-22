package graph;

public class Vertex {
	
	int data;
	boolean visited;
	
	public Vertex(int data)
	{
		this.data=data;
		visited=false;
	}

	@Override
	public String toString() {
		return " "+data;
	}

	
}
