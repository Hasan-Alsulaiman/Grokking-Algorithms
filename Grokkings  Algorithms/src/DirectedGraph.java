import java.util.*;
import java.util.stream.Collectors;

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

    public List<Set<String>> neighboursOf(String node){
        node = cleanStr(node);
        return (graph.containsKey(node))? graph.get(node).stream()
                .map(map -> map.keySet())
                .collect(Collectors.toList()): null;
    }

    private String cleanStr(String input){
        return input.strip().toLowerCase(Locale.ROOT);
    }

    @Override
    public String toString() {
        return "DirectedGraph" + graph;
    }

    public static void main(String[] args) {
        DirectedGraph g = new DirectedGraph();
        g.add("start", "a", 6);
        g.add("start", "b", 2);
        g.add("b", "a", 1);
        g.add("b", "fin", 2);
        System.out.println(g.neighboursOf("a"));
    }
}
