import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthSearch {
    Graph graph;
    Queue<String> q;
    BreadthSearch(Graph graph){
        this.graph = graph;
        this.q = new LinkedList<>();
    }

    private void addToQ(ArrayList<String> arrayList){
        for(String str: arrayList){
            this.q.add(str);
        }
    }

    public void search(String startPoint, String element){
        addToQ(graph.get(startPoint));

    }
}
