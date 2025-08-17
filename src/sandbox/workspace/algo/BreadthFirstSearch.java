import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BreadthFirstSearch {
           
    private static int numberOfNodes;
    private static ArrayList<ArrayList<Integer>> graph;
    private static ArrayList<Integer> bfOrder;

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
        breadthFirstSort(0);

        // Display results
        System.out.println("Breadth firat traversal from Node 0: " + bfOrder);
    }

    private static void addEdge(int src, int dest)
    {
        graph.get(src).add(dest);
    }

    private static void breadthFirstSort(int startNode) 
    {
        boolean[] visited = new boolean[numberOfNodes];
        bfOrder = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();
        queue.add(startNode);
        visited[startNode] = true;

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            bfOrder.add(currentNode);
            ArrayList<Integer> neighbors = graph.get(currentNode);
            for (int neighbor : neighbors) {
                queue.add(neighbor);
                visited[neighbor] = true;
            }
        }
    }
}
