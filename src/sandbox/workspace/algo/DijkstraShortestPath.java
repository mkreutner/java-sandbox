import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class DijkstraShortestPath 
{

    private static int startNode;
    private static int numberOfNodes;
    private static ArrayList<ArrayList<Node>> graph = new ArrayList<>(numberOfNodes);
    private static int[] distances;
    
    public static void main(String[] args)
    {
        // Initialize the graph
        numberOfNodes = 6;
        graph = new ArrayList<>(numberOfNodes);
        for (int i = 0; i < numberOfNodes; i++) {
            graph.add(new ArrayList<Node>());
        }
        // Add node into graph
        addWeightedEdge(0, 1, 2);
        addWeightedEdge(0, 2, 4);
        addWeightedEdge(1, 2, 1);
        addWeightedEdge(1, 3, 7);
        addWeightedEdge(2, 4, 3);
        addWeightedEdge(3, 4, 2);
        addWeightedEdge(4, 5, 5);
        // Starting node
        startNode = 0;
        // Execute Dijkstra algorithme in order to find minimal distances
        dijkstra();
        // Display results
        System.out.println("Minimal distances from start node " + startNode + ": ");
        for (int i = 0; i < distances.length; i++) {
            System.out.println("Node(" + i + "): " + distances[i]);
        }
    }

    /**
     * Add a weighted edge into graph 
     */
    private static void addWeightedEdge(int from, int to, int weight)
    {
        graph.get(from).add(new Node(to, weight));
    }


    private static void dijkstra()
    {
        distances = new int[numberOfNodes];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[startNode] = 0;
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Node(startNode, 0));
        while (!priorityQueue.isEmpty()) {
            Node currentNode = priorityQueue.poll();
            int cNode = currentNode.node;
            int cDist = currentNode.distance;
            if (cDist > distances[cNode]) {
                continue;
            }
            for (Node neighbor : graph.get(cNode)) {
                int newDist = distances[cNode] + neighbor.distance;
                if (newDist < distances[neighbor.node]) {
                    distances[neighbor.node] = newDist;
                    priorityQueue.add(new Node(neighbor.node, newDist));
                }
            }
        }
    }

    /**
     * Define a Node
     */
    static class Node implements Comparable<Node> {
        int node;
        int distance;

        Node(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.distance, other.distance);
        }
    }
}
