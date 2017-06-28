/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphProblems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class ShortestPath
{
    ArrayList<Edge> edges;
    int totalWeightedPath;
    public ShortestPath(){
        edges = new ArrayList<>();
        totalWeightedPath = 0;
    }
}
public class SingleSourceShortestPathWithPositiveEdgeWeights {
    public static void main(String[] args)
    {
        DirectedGraph graph = new DirectedGraph();
        //Crreate some vertices 
        Vertex v_A = new Vertex("A");
        Vertex v_B = new Vertex("B");
        Vertex v_C = new Vertex("C");
        Vertex v_D = new Vertex("D");
        Vertex v_E = new Vertex("E");
        Vertex v_F = new Vertex("F");
        Vertex v_G = new Vertex("G");
        Vertex v_H = new Vertex("H");
        graph.addVertex(v_A);
        graph.addVertex(v_B);
        graph.addVertex(v_C);
        graph.addVertex(v_D);
        graph.addVertex(v_E);
        graph.addVertex(v_F);
        graph.addVertex(v_G);
        graph.addVertex(v_H);
        Edge e1 = new Edge(v_A, v_B, 1);
        Edge e2 = new Edge(v_A, v_B, 1);
        Edge e3 = new Edge(v_B, v_C, 2);
        Edge e4 = new Edge(v_C, v_E, 3);
        Edge e5 = new Edge(v_E, v_D, 4);
        Edge e6 = new Edge(v_E, v_F, 5);
        Edge e7 = new Edge(v_E, v_G, 8);
        Edge e8 = new Edge(v_G, v_B, 6);
        Edge e9 = new Edge(v_A, v_G, 7);
        
        graph.addEdge(e1);
        graph.addEdge(e2);
        graph.addEdge(e3);
        graph.addEdge(e4);
        graph.addEdge(e5);
        graph.addEdge(e6);
        graph.addEdge(e7);
        graph.addEdge(e8);
        graph.addEdge(e9);
        
        //Find shortest path between given nodes
        ShortestPath sp = new ShortestPath();
        sp = getShortestPath(v_A, v_C, graph);
    }
    
    public static ShortestPath getShortestPath(Vertex S, Vertex D, DirectedGraph graph)
    {
        
        ShortestPath sp = new ShortestPath();
        // use the Dijkstra's algorithm.
        List<Edge> EdgeSet = new ArrayList<>();
        //set source vertext d as zero.
        S.d = 0;
        Collection<Vertex> values = graph.vertices.values();
        //convert values to the TreeMap.
        Map<Integer, Vertex> treemap = new TreeMap<>();
        values.forEach((v) -> {
            treemap.put(v.d, v);
        });
        
        
        
        return sp;
    }
    
    
}
