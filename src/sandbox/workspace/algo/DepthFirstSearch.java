import java.util.ArrayList;
import java.util.Stack;

public class DepthFirstSearch {
       
    private static int numberOfNodes;
    private static ArrayList<ArrayList<Integer>> graph;
    private static ArrayList<Integer> dfOrder;

    public static void main(String[] args) 
    {
        // Representation of directed graph as adjacency list
        numberOfNodes = 6;
        graph = new ArrayList<>();
        for (int i = 0; i < numberOfNodes; i++) {
            graph.add(new ArrayList<Integer>());
        }

        // Add edges of the graph
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 3);
        addEdge(2, 4);
        addEdge(3, 5);

        // do the depth first sort
        depthFirstSort(0);

        // Display results
        System.out.println("Depth traversal from Node 0: " + dfOrder);
    }

    private static void addEdge(int src, int dest)
    {
        graph.get(src).add(dest);
    }

    private static void depthFirstSort(int startNode) 
    {
        boolean[] visited = new boolean[numberOfNodes];
        Stack<Integer> stack = new Stack<>();
        dfOrder = new ArrayList<>();
        stack.push(startNode);

        while (!stack.isEmpty()) {
            int currentNode = stack.pop();
            if (!visited[currentNode]) {
                dfOrder.add(currentNode);
                visited[currentNode] = true;
                ArrayList<Integer> neighbors = graph.get(currentNode);
                for (int neighbor : neighbors) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
}
