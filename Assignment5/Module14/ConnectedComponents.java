package Assignment5.Module14;

import java.util.ArrayList;
import java.util.List;

public class ConnectedComponents {
    static void dfs(int node, boolean[] visited, List<List<Integer>> adj) {
        visited[node] = true;

        for (int nei : adj.get(node))
            if (!visited[nei])
                dfs(nei, visited, adj);
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(3).add(4);

        boolean[] visited = new boolean[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, visited, adj);
                count++;
            }
        }

        System.out.println("Connected Components: " + count);
    }
}
