import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    HashMap<String, ArrayList<String>> graph;

    Graph(){
        graph = new HashMap<>();
    }

    public void add(String first, String second){
//        takes key and value and adds value to key while preserving existing values
        ArrayList<String> existing = this.graph.get(first);
        existing.add(second);
        this.graph.put(first, existing);

    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> graph = new HashMap<>();
        ArrayList<String> values = new ArrayList<>();
        values.add("car");
        graph.put("cab", values);
        graph.put("cab", graph.get("cab").add("cat"));
        graph.put("car", "cat");
        graph.put("car", "bar");
        System.out.println(graph);

    }
}
