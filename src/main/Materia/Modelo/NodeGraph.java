package main.Materia.Modelo;

import java.util.LinkedList;
import java.util.List;


public class NodeGraph {

    private int value;
    private List<NodeGraph> neighbors;

    public NodeGraph(int value) {
        this.value = value;
        this.neighbors = new LinkedList<>();
    }
 
    public void addNeighbor(NodeGraph neighbor) {
        // Evitar añadir el mismo nodo varias veces
        if (!neighbors.contains(neighbor)) {
            neighbors.add(neighbor);
        }
    }

    
    public int getValue() {
        return value;
    }    
    public List<NodeGraph> getNeighbors() {
        return neighbors;
    }
  

    
}
