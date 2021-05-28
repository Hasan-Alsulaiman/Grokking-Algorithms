import java.util.*;

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
        System.out.println(q.peek() + " " + element);
        String gElement = q.poll();
        if (element.equals(gElement))
            return true;

        addToQ(graph.get(gElement));

        if (q.isEmpty())
            return false;

        return search(element);

    }

    public void pathFinder(String element){
        Set<String> visited = new HashSet<>();
        while(!q.isEmpty()){
            String gElement = q.poll();
            if(visited.contains(gElement))
                continue;
            visited.add(gElement);
            if(element.equals(gElement))
                System.out.println("found it");
            if(!element.equals(gElement))
                addToQ(graph.get(gElement));
        }
    }

}
