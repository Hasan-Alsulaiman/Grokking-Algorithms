import java.util.HashMap;

public class Djikstra {
    DirectedGraph graph;
    HashMap cost;
    HashMap parent;

    public Djikstra(DirectedGraph graph) {
        this.graph = graph;
        this.cost = new HashMap();
        this.parent = new HashMap();
    }
}
