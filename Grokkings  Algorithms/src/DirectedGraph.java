import java.util.*;
import java.util.stream.Collectors;

public class DirectedGraph {
    public class Edge<V> {
        V destination;
        int weight;

        public Edge(V destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "[ " + "-" + destination + ", " + weight + "]";
        }
    }

    ArrayList<Edge<?>> graph;

    public DirectedGraph() {
        this.graph = new ArrayList<>();
    }

    public void add(Edge<?> edge){
        this.graph.add(edge);
    }

    public <V> void add(V source, V destination, int wieght){
        this.graph.add(new Edge<>(source, destination, wieght));
    }

    private String cleanStr(String input){
        return input.strip().toLowerCase(Locale.ROOT);
    }

    @Override
    public String toString() {
        return "Directed Graph " + this.graph;
    }

    public static void main(String[] args) {
        DirectedGraph g = new DirectedGraph();
        g.add("start", "a", 6);
        g.add("start", "b", 2);
        g.add("b", "a", 1);
        g.add("b", "fin", 2);
        System.out.println(g);
    }
}
