import java.util.HashMap;

public class Djikstra {
    DirectedGraph graph;
    HashMap<String, Double> cost;
    HashMap<String, Double> parent;

    public Djikstra(DirectedGraph graph) {
        this.graph = graph;
        this.cost = new HashMap();
        this.parent = new HashMap();
    }
}
