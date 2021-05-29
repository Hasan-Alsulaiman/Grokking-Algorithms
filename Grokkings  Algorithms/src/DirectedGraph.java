import java.util.*;

public class DirectedGraph {

    public HashMap<String, Integer> graph;
    public HashMap<String, String> parent;
    DirectedGraph() {
        graph = new HashMap<>();
        parent = new HashMap<>();
    }

    public void add(String first, String second, Integer cost) {
        first = cleanStr(first);
        second = cleanStr(second);
        graph.put(createKey(first,second), cost);
        parent.put(second, first);
    }

    private String createKey(String first, String second){
        return first + "-" + second;
    }

    private String cleanStr(String input){
        return input.strip().toLowerCase(Locale.ROOT);
    }

    public Integer getCost(String first, String second){
        return graph.get(createKey(first, second));
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
        g.add("b", "a", 3);
        g.add("a", "fin", 1);
        g.add("b", "fin", 5);
        System.out.println(g);
        System.out.println(g.getCost("b","a"));
        System.out.println(g.parent);
    }
}
