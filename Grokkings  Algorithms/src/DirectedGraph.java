import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class DirectedGraph {
    HashMap<String, List<Map<String, Integer>>> graph;

    DirectedGraph() {
        graph = new HashMap<>();
    }

    public void add(String first, String second, Integer cost) {

        graph.put(cleanStr(first), Map.of(cleanStr(second), cost));
    }

    private String cleanStr(String input){
        return input.strip().toLowerCase(Locale.ROOT);
    }

    @Override
    public String toString() {
        return "DirectedGraph{" + graph +
                '}';
    }

    public static void main(String[] args) {
        DirectedGraph g = new DirectedGraph();
        g.add("start", "a", 6);
        g.add("start", "b", 2);
        System.out.println(g);
    }
}
