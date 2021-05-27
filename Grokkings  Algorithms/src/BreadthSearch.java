import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthSearch {
    Graph graph;
    Queue<String> q;
    BreadthSearch(Graph graph, String startPoint){
        this.graph = graph;
        this.q = new LinkedList<>();
        addToQ(graph.get(startPoint));
    }

    private void addToQ(ArrayList<String> arrayList){
        for(String str: arrayList){
            this.q.add(str);
        }
    }

    public boolean search(String element) {
        if (q.poll() == element)
            return true;

        if (q.poll().equals(null))
            return false;

        addToQ(graph.get(q.poll()));
        return search(element);

    }

}
