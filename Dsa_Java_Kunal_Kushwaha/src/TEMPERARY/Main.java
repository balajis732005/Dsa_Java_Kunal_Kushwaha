package TEMPERARY;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] graph = {{1, 0, 1, 1}, {0, 1, 0, 1}, {1, 0, 1, 0}, {1, 1, 0, 1}};
        bfs(graph);
    }

    public static void bfs(int[][] graph) {
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int i = 0; i < graph[node].length; i++) {
                if (graph[node][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
