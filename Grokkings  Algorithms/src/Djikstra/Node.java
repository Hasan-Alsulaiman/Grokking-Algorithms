package Djikstra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Node {
    private String name;
    private Integer distance = Integer.MAX_VALUE;
    private HashMap<Node, Integer> friends = new HashMap<>();
    private List<Node> shortestPath = new ArrayList<>();

    Node(String name) {
        this.name = name;
    }

    public void addDestination(Node destination, int distance){
        friends.put(destination, distance);
    }

//    getters and setters
    public String getName() {
        return name;
    }

    public Integer getDistance() {
        return distance;
    }

    public HashMap<Node, Integer> getFriends() {
        return friends;
    }

    public List<Node> getShortestPath() {
        return shortestPath;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public void setFriends(HashMap<Node, Integer> friends) {
        this.friends = friends;
    }

    public void setShortestPath(List<Node> shortestPath) {
        this.shortestPath = shortestPath;
    }
}
