package Djikstra;

import java.util.HashSet;

public class WeightedGraph {
    //    a graph is a set of node pairs
    HashSet<Node> nodes = new HashSet<>();

    public void addNode(Node node) {
        nodes.add(node);
    }
}
