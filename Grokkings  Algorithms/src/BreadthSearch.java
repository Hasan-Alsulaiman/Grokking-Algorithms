import java.util.*;

public class BreadthSearch {
    Graph graph;
    Queue<Stack<String>> q;
    BreadthSearch(Graph graph, String startPoint){
        this.graph = graph;
        this.q = new LinkedList<>();
        Stack<String> firstStack = new Stack<>();
        firstStack.add(startPoint);
        addToQ(firstStack);
    }

    private void addToQ(Stack<String> gElement ){
        List<String> arrayList = graph.get(gElement.peek());
        for(String neighbours: arrayList){
            Stack<String> path =(Stack<String>) gElement.clone();
            path.add(neighbours);
            q.add(path);

        }

    }


    public String pathFinder(String element){
        Set<String> visited = new HashSet<>();
        while(!q.isEmpty()){
            Stack<String> gElement = q.poll();
            if(visited.contains(gElement.peek()))
                continue;
            visited.add(gElement.peek());
            if(element.equals(gElement.peek()))
                return "found it! path: " + gElement;
            if(!element.equals(gElement.peek()))
                addToQ(gElement);
        }
        return "not found!";
    }

}
