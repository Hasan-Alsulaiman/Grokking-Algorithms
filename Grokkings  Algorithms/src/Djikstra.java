import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Djikstra {
    DirectedGraph graph;
    HashMap<Object, Integer> cost;
    HashMap<Object, Object> parent;
    ArrayList<Object> processed;
    String start;

    public Djikstra(DirectedGraph graph, String start) {
        this.graph = graph;
        this.start = start;
        this.cost = new HashMap();
        this.parent = new HashMap();
        this.processed = new ArrayList<>();
    }

    public DirectedGraph.Edge getCheapest(List<DirectedGraph.Edge> nodes) {
        DirectedGraph.Edge smallest = nodes.get(0);
        for (DirectedGraph.Edge element : nodes) {
            if(element.getWeight() < smallest.getWeight()){
                smallest = element;
            }
        }
        return smallest;
    }

    public void getPath(String end){
        Object current = start;

        while(!processed.contains(current) & !current.equals(end)) {
            var friends = graph.getFriends(current);
            var cheapest = getCheapest(friends);
            processed.add(current);
            parent.put(current, cheapest.getDestination());
            cost.put(cheapest, cheapest.getWeight())
            current = cheapest.getDestination();
        }

        System.out.println(parent);
    }


}
