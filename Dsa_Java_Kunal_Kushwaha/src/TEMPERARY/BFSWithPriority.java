package TEMPERARY;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class BFSWithPriority {
    public static void bfs(int[][] matrix, int source) {
        int n = matrix.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(source);
        visited[source] = true;

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            // Find neighbors
            List<Integer> neighbors = new ArrayList<>();
            for (int neighbor = 0; neighbor < n; neighbor++) {
                if (matrix[currentNode][neighbor] == 1 && !visited[neighbor]) {
                    neighbors.add(neighbor);
                }
            }

            // Sort neighbors based on node values using a custom comparator
            Collections.sort(neighbors, Comparator.comparingInt(node -> matrix[node][node]));

            // Enqueue sorted neighbors
            for (int neighbor : neighbors) {
                queue.add(neighbor);
                visited[neighbor] = true;
            }
        }
    }

    public static void main(String[] args) {
        // Example Usage
        int[][] matrix = {
                {1, 0, 1, 1},
                {0, 1, 0, 1},
                {1, 0, 1, 0},
                {1, 1, 0, 1}
        };

        int sourceNode = 2;

        System.out.println("Breadth-First Traversal:");
        bfs(matrix, sourceNode);
    }
}
