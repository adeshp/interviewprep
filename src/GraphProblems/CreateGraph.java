/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphProblems;

import java.util.HashMap;

/**
 *
 * @author v-akdesh
 */
public class CreateGraph implements IGraphCreation{

    @Override
    public HashMap<String, Node> create() {
        HashMap<String, Node> graph = new HashMap();
        //Create Nodes for the graph
        Node n1 = new Node("1");
        Node n2 = new Node("2");
        Node n3 = new Node("3");
        Node n4 = new Node("4");
        Node n5 = new Node("5");
        Node n6 = new Node("6");
        Node n7 = new Node("7");
        Node n8 = new Node("8");
        //Create adjacency list with the graphs.
        n1.adjacencyList.add(0,n2);
        n2.adjacencyList.add(0,n3);
        n3.adjacencyList.add(0,n2);
        n3.adjacencyList.add(1,n4);
        n4.adjacencyList.add(0,n1);
        n5.adjacencyList.add(0,n4);
        n5.adjacencyList.add(1,n6);
        n5.adjacencyList.add(2,n7);
        n7.adjacencyList.add(0,n3);
                
        graph.put(n1.label, n1);
        graph.put(n2.label, n2);
        graph.put(n3.label, n3);
        graph.put(n4.label, n4);
        graph.put(n5.label, n5);
        graph.put(n6.label, n6);
        graph.put(n7.label, n7);
        return graph;
    }
    
}
