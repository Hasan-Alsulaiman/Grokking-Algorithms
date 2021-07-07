package Djikstra;

import java.util.HashSet;
import java.util.Set;

public class WeightedGraph {
    //    a graph is a set of node pairs
    private HashSet<Node> nodes = new HashSet<>();

    public void addNode(Node node) {
        nodes.add(node);
    }

    public HashSet<Node> getNodes() {
        return nodes;
}}
