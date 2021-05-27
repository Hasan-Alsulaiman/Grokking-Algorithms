import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthSearch {
    Graph graph;
    Queue<String> q;
    BreadthSearch(Graph graph, String startPoint){
        this.graph = graph;
        this.q = new LinkedList<>();
        addToQ(graph.get(startPoint));
    }

    private void addToQ(List<String> arrayList){

        q.addAll(arrayList);

    }

    public boolean search(String element) {

        String gElement = q.poll();
        if (element.equals(gElement))
            return true;

        addToQ(graph.get(gElement));

        if (q.isEmpty())
            return false;

        return search(element);

    }

}
