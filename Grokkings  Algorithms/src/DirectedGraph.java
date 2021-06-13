import java.util.*;

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
            return "(" + "-" + destination + ", " + weight + ")" ;
        }
    }

    List<Edge> edge;
    Map<String, List<Edge>> graphMap;

    public DirectedGraph() {

        this.graphMap = new HashMap<>();
    }

    public <V> void add(String source, V destination, int wieght){
        if(graphMap.containsKey(source))
            this.graphMap.get(source).add(new Edge<>(destination, wieght));
        else {
            edge = new ArrayList<>();
            edge.add(new Edge<>(destination, wieght));
            this.graphMap.put(source, edge);
        }
    }

    private String cleanStr(String input){
        return input.strip().toLowerCase(Locale.ROOT);
    }

    @Override
    public String toString() {
        String result = "Graph:";
        for(String key: this.graphMap.keySet()){
            result = result + "\n" + key + "=" + this.graphMap.get(key);
        }
        return result;
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
