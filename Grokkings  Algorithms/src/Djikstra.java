import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Djikstra {
    DirectedGraph graph;
    HashMap<String, Double> cost;
    HashMap<String, Double> parent;
    ArrayList<String> processed;
    String start;

    public Djikstra(DirectedGraph graph, String start) {
        this.graph = graph;
        this.start = start;
        this.cost = new HashMap();
        this.parent = new HashMap();
        this.processed = new ArrayList<>();
    }

    private DirectedGraph.Edge getCheapest(List<DirectedGraph.Edge> nodes) {
        DirectedGraph.Edge smallest = nodes.get(0);
        for (DirectedGraph.Edge element : nodes) {
            if(element.getWeight() < smallest.getWeight()){
                smallest = element;
            }
        }
        return smallest;
    }


}
