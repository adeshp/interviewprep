
package GraphProblems;

import java.util.ArrayList;
enum State { Visited, Unvisited, Visiting};
class Node {
    String label;
    State State;
    ArrayList<Node> adjacencyList;
    
    Node(String label)
    {
        this.label = label;
        this.adjacencyList = new ArrayList();
    }
}

