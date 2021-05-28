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

    public List<String> search(String element, List<String> path) {

        String gElement = q.poll();
        if (element.equals(gElement)){
            path.add(gElement);
            return path;
        }


        addToQ(graph.get(gElement));

        if (q.isEmpty())
            return new LinkedList<>();

        return search(element, path);

    }

}
