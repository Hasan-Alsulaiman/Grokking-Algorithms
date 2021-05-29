import java.util.*;

public class DirectedGraph {
    HashMap<String, LinkedList<Map<String, Integer>>> graph;

    DirectedGraph() {
        graph = new HashMap<>();
    }

    public void add(String first, String second, Integer cost) {
        first = cleanStr(first);
        second = cleanStr(second);
        if(!graph.containsKey(first)){
            HashMap<String, Integer> map = new HashMap<>();
            map.put(second, cost);
            LinkedList<Map<String, Integer>> list = new LinkedList<>();
            list.add(map);
            graph.put(first, list);
        }else{
            LinkedList<Map<String, Integer>> existingList = graph.get(first);
            HashMap<String, Integer> newMap = new HashMap<>();
            newMap.put(second, cost);
            existingList.add(newMap);
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
