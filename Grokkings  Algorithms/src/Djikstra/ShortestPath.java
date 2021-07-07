package Djikstra;

import java.util.HashMap;
import java.util.Set;

public class ShortestPath {
    private WeightedGraph graph;

    ShortestPath(WeightedGraph graph) {
        this.graph = graph;
    }

    private Node getLowestDistanceNode(Set<Node> unsettledNodes){
        Integer smallestDistance = Integer.MAX_VALUE;
        Node smallestDistanceNode = null;
        for(Node node: unsettledNodes){
            if(node.getDistance() < smallestDistance){
                smallestDistance = node.getDistance();
                smallestDistanceNode = node;
            }
        }
        return smallestDistanceNode;
    }
}
