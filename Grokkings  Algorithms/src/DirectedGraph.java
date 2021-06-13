import java.util.*;
import java.util.stream.Collectors;

public class DirectedGraph {


    private String cleanStr(String input){
        return input.strip().toLowerCase(Locale.ROOT);
    }

    @Override
    public String toString() {
        return "Directed Graph " ;
    }

    public static void main(String[] args) {
        DirectedGraph g = new DirectedGraph();
//        g.add("start", "a", 6);
//        g.add("start", "b", 2);
//        g.add("b", "a", 1);
//        g.add("b", "fin", 2);
//        System.out.println(g.costOf("start", "a"));
    }
}
