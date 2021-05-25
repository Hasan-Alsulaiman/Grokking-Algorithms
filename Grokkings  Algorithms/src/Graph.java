import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class Graph {
    HashMap<String, ArrayList<String>> graph;

    Graph(){
        graph = new HashMap<>();
    }

    public void add(String first, String second){
        first = first.toLowerCase();
        second = second.toLowerCase();
//        takes key and value and adds value to key while preserving existing values
        if(!this.graph.containsKey(first)){
            ArrayList<String> values = new ArrayList<>();
            values.add(second);
            this.graph.put(first, values);
        }

        else {
            ArrayList<String> existing = this.graph.get(first);
            existing.add(second);
            this.graph.put(first, existing);
        }

    }

    @Override
    public String toString() {
        return "Graph" +
                graph;
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        g.add("cab", "car");
        g.add("cab", "cat");
        g.add("car", "Cat");
        g.add("CAR", "bar");
        System.out.println(g);

    }
}
