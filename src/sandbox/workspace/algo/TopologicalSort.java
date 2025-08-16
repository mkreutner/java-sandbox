import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {
   
    private static int numberOfNodes;
    private static ArrayList<ArrayList<Integer>> graph;
    private static ArrayList<Integer> topologicalOrder;

    public static void main(String[] args) 
    {
        // Representation of directed graph as adjacency list
        numberOfNodes = 6;
        graph = new ArrayList<>();
        for (int i = 0; i < numberOfNodes; i++) {
            graph.add(new ArrayList<Integer>());
        }

        // Add edges of the graph
        addEdge(5, 2);
        addEdge(5, 0);
        addEdge(4, 0);
        addEdge(4, 1);
        addEdge(2, 3);
        addEdge(3, 1);

        // do the topological sort
        topologicalSort();

        // Display results
        System.out.println("Topological sort order" + topologicalOrder);
    }

    private static void addEdge(int src, int dest)
    {
        graph.get(src).add(dest);
    }

    private static void topologicalSort() 
    {
        int[] inDegree = new int[numberOfNodes];
        for (int i = 0; i < numberOfNodes; i++) {
            ArrayList<Integer> neighbors = graph.get(i);
            for (Integer neighbor : neighbors) {
                inDegree[neighbor]++;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numberOfNodes; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }
        topologicalOrder = new ArrayList<>();
        while (!queue.isEmpty()) {
            int node = queue.poll();
            topologicalOrder.add(node);
            ArrayList<Integer> neighbors = graph.get(node);
            for (Integer neihbor : neighbors) {
                inDegree[neihbor]--;
                if (inDegree[neihbor] == 0) {
                    queue.add(neihbor);
                }
            }
        }
    }
}
