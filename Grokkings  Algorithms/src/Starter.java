import java.util.List;

public class Starter {
    public static void main(String[] args) {
        var graph = new DirectedGraph();
        graph.add("start", "a", 6);
        graph.add("start", "b", 2);
        graph.add("b", "a", 1);
        graph.add("b", "fin", 2);
        graph.add("a", "c", 2);
        graph.add("c", "fin", 2);
        var algo = new Djikstra(graph, "start");
        List nodes = graph.getFriends("start");
        System.out.println(graph);
        algo.getPath("fin");

    }
}
