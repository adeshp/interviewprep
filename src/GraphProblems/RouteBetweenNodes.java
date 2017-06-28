/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphProblems;

import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author v-akdesh
 */
public class RouteBetweenNodes {
    public static void main(String[] args)
    {
        CreateGraph cr = new CreateGraph();
        HashMap<String, Node> graph = cr.create();
        Boolean exists = routeExists(graph, "4", "3");
        System.out.println(exists.toString());
    }
    
    public static Boolean routeExists(HashMap<String, Node> g, String label1, String label2)
    {
        if(g.containsKey(label1) && g.containsKey(label2))
        {
            if(label1.equals(label2)){
                return true;
            }
            else
            {
                return BFS(g, label1, label2);
            }
        }
        return false;
    }
    
    public static Boolean BFS(HashMap<String, Node> g, String label1, String label2)
    {
        //Do a breadth-first search
                g.forEach((K,V)-> { V.State = State.Unvisited; });
                LinkedList<Node> queue = new LinkedList();
                //Get the starting node
                Node end = g.get(label2);
                Node start = g.get(label1);
                start.State = State.Visiting;
                queue.add(start);
                Node temp;
                while(!queue.isEmpty()){
                    temp = queue.removeFirst();
                    if(temp != null)
                    {
                        //Collect it's adjcency list
                        for(Node a : temp.adjacencyList)
                        {
                            if(a.State == State.Unvisited)
                            {
                                if(a == end)
                                {
                                    return true;
                                }
                                else
                                {
                                    a.State = State.Visiting;
                                    queue.add(a);
                                }
                            }
                        }
                        temp.State = State.Visited;
                    }
                
                }
                return false;
}
    
   public static Boolean DFS(HashMap<String, Node> g, String label1, String label2)
   {
       g.forEach((K,V)-> { V.State = State.Unvisited; });
       Node end = g.get(label2);
       Node start = g.get(label1);
       if(DFSGO(start, end) != null)
           return true;
       else return false;
    }
   
   public static Node DFSGO(Node start, Node end)
   {
       if(start == null){
           return null;
       }
       Node temp = null;
       start.State = State.Visited;
       for(Node n : start.adjacencyList)
       {
           if(n.State == State.Unvisited){
               if(n == end)
               {
                   temp = n;
               }
               else
               {
                   DFSGO(n, end);
               }
           }
       }
       return temp;
   }
}
