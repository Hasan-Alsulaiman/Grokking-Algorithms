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
//        searches for element in a graph, returns path to element if found
        Set<String> visited = new HashSet<>();
        while(!q.isEmpty()){
            Stack<String> path = q.poll();
            if(visited.contains(path.peek()))
                continue;
            visited.add(path.peek());
            if(element.equals(path.peek()))
                return "found it 🐇 path: " + path;
            if(!element.equals(path.peek()))
                addToQ(path);
        }
        return "not found!";
    }

}
