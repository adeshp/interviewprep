/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphProblems;

import java.util.ArrayList;
import java.util.HashMap;

class Vertex{
    String label;
    //Shortest path predecessor
    String pred;
    //Shortest path estimation;
    int d;
    //Adjacency list for this vertex
    ArrayList<Vertex> neighbours;
    
    public Vertex(String label)
    {
        this.label = label;
        this.pred = null;
        this.d = Integer.MAX_VALUE;
    }
    
    public int getSDE(){
        return d;
    }
    
    public String getPredecessor()
    {
        return pred;
    }
    
    public void setPredecessor(String pred)
    {
        this.pred = pred;
    }
    
    public void setEstimate(int d)
    {
        this.d = d;
    }
    public ArrayList<Vertex> getNeighbours()
    {
        return neighbours;
    }
    
    public void addNeighbour(Vertex v)
    {
        this.neighbours.add(v);
    }
}

class Edge{
    Vertex source;
    Vertex destination;
    int weight;
    public Edge(Vertex s, Vertex d, int w)
    {
        source = s;
        destination = d;
        weight = w;
    }
    public int getWeight()
    {
        return weight;
    }
    public Vertex getSource()
    {
        return source;
    }
    public Vertex getDestination()
    {
        return destination;
    }
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + weight;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edge other = (Edge) obj;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

    
}


public class DirectedGraph {
    HashMap<String, Vertex> vertices;
    ArrayList<Edge> edges;
    public DirectedGraph()
    {
        vertices = new HashMap<>();
        edges = new ArrayList<>();
    }
    public void addVertex(Vertex v)
    {
        if(!vertices.containsKey(v.label))
        {
            vertices.put(v.label, v);
            System.out.println(v.label + " Added");
        }
        else
        {
            System.out.println("Vertex already exits. Please add different one.");
        }
    }
    public void addEdge(Edge e)
    {
        if(vertices.containsKey(e.source.label) && vertices.containsKey(e.destination.label))
        {
            //check if the (u,v) = d edge exits in the arraylist
            if(edges.contains(e))
            {
                System.out.println(e.source.label + " and " + e.destination.label + " edge already present.");
            }
            else{
                edges.add(e);
                System.out.println(e.source.label + " and " + e.destination.label + " edge added");
            }
        }
        else
        {
            System.out.println(e.source.label + " and " + e.destination.label + " edge can not added as the vertices are not present.");
        }
    }
    
    
    
}
