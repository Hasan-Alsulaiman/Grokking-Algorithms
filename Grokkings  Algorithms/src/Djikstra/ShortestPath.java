package Djikstra;

import java.util.*;

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

    private void calculateMinimumDistance(Node evaluationNode, Integer edgeWeight, Node sourceNode) {
        if(sourceNode.getDistance() + edgeWeight < evaluationNode.getDistance()){
            evaluationNode.setDistance(sourceNode.getDistance() + edgeWeight);
            ArrayList<Node> shortestPath = new ArrayList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            evaluationNode.setShortestPath(shortestPath);
        }
    }

    public WeightedGraph getShortestPath(Node source){
        source.setDistance(0);
        Set<Node> settled = new HashSet<>();
        Set<Node> unSettled = new HashSet<>();
        unSettled.add(source);
        while (unSettled.size() != 0) {
            Node current = getLowestDistanceNode(unSettled);
            unSettled.remove(current);
            for (Map.Entry<Node, Integer> friends: current.getFriends().entrySet()) {
                Node aFriend = friends.getKey();
                int distance = friends.getValue();
                if( !unSettled.contains(aFriend) ){
                    calculateMinimumDistance(aFriend, distance, current);
                    unSettled.add(aFriend);
                }
                settled.add(current);
            }
        }
        return graph;
    }
}
