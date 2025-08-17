import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class BellmanFordShortestPath {
   
    private static int startNode;
    private static int numberOfNodes;
    private static ArrayList<ArrayList<Edge>> graph = new ArrayList<>(numberOfNodes);
    private static int[] distances;
    
    public static void main(String[] args)
    {
        // Initialize the graph
        numberOfNodes = 5;
        graph = new ArrayList<>(numberOfNodes);
        for (int i = 0; i < numberOfNodes; i++) {
            graph.add(new ArrayList<Edge>());
        }
        // Add node into graph
        addWeightedEdge(0, 1, 6);
        addWeightedEdge(0, 2, 7);
        addWeightedEdge(1, 3, 5);
        addWeightedEdge(2, 1, -2);
        addWeightedEdge(2, 4, 2);
        addWeightedEdge(3, 4, 7);
        addWeightedEdge(4, 3, -3);
        addWeightedEdge(2, 0, 7);
        // Starting node
        startNode = 0;
        // Execute Bellman-Ford algorithme in order to find minimal distances
        bellmanFord();
        // Display results
        System.out.println("Minimal distances from start node " + startNode + ": ");
        for (int i = 0; i < distances.length; i++) {
            System.out.println("Node(" + i + "): " + distances[i]);
        }
        // Detect if negative cycles exists
        if (hasNegativeCycle()) {
            System.out.println("Graph has at least one negative cycle.");
        } else {
            System.out.println("Graph does not containt negative cycle.");
        }
    }

    /**
     * Add a weighted edge into graph 
     */
    private static void addWeightedEdge(int from, int to, int weight)
    {
        graph.get(from).add(new Edge(to, weight));
    }

    /**
     * Implement Bellman-Ford algorithme
     */
    private static void bellmanFord()
    {
        distances = new int[numberOfNodes];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[startNode] = 0;
        for (int i = 0; i < numberOfNodes - 1; i++) {
            for (int node = 0; node < numberOfNodes; node++) {
                for (Edge edge : graph.get(node)) {
                    if (
                        distances[node] != Integer.MAX_VALUE 
                        && distances[node] + edge.weight < distances[edge.node]
                    ) {
                        distances[edge.node] = distances[node] + edge.weight;
                    }
                }
            }
        }
    }

    /**
     * Detect if graph containt at least one negative cycle
     * @return true if at least negatif cycle is present in graph
     *         false otherwise.
     */
    private static boolean hasNegativeCycle()
    {
        for (int node = 0; node < numberOfNodes; node++) {
            for (Edge edge : graph.get(node)) {
                if (
                    distances[node] != Integer.MAX_VALUE 
                    && distances[node] + edge.weight < distances[edge.node]
                ) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Define a Edge
     */
    static class Edge {
        int node;
        int weight;

        Edge(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    } 
}
