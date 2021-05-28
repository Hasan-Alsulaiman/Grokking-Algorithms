import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


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

    public List<String> get(String key){

        return (this.graph.containsKey(key))? this.graph.get(key): new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Graph" +
                graph;
    }

    public static String subString( String input, int start, int end){
//takes an input string, start position and end position and returns substring of the input
        StringBuilder result = new StringBuilder();
        if(start > end)
            for(int i=start; i >= end; i--){
                result.append(input.charAt(i));
            }
        if(start < end)
            for(int i=start; i <= end; i++){
                result.append(input.charAt(i));
            }

        return result.toString();
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        g.add("cab", "car");
        g.add("cab", "cat");
        g.add("car", "Cat");
        g.add("CAR", "bar");
        System.out.println(g);

        BreadthSearch bs = new BreadthSearch(g, "cab");
        bs.pathFinder("bar");



    }
}
