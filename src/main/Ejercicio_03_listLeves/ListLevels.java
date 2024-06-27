package main.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Materia.Modelo.Node;

public class ListLevels {

   
    public List<List<Integer>> listLevels(Node root) {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null) return levels;
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();
            
            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                level.add(node.getValue());
                
                if (node.getLeft() != null) queue.add(node.getLeft());
                if (node.getRight() != null) queue.add(node.getRight());
            }
            levels.add(level);
        }
        return levels;
    }
    
}
