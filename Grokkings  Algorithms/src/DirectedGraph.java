import java.util.*;

public class DirectedGraph {
    HashMap<String, LinkedList<Map<String, Integer>>> graph;

    DirectedGraph() {
        graph = new HashMap<>();
    }

    public void add(String first, String second, Integer cost) {
        first = cleanStr(first);
        second = cleanStr(second);
        HashMap<String, Integer> map = new HashMap<>();
        LinkedList<Map<String, Integer>> list = new LinkedList<>();
        if(!graph.containsKey(first)){
            map.put(second, cost);
            list.add(map);
            graph.put(first, list);
        }else{
            list = graph.get(first);
            map.put(second, cost);
            list.add(map);
        }

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
