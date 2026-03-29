package Assignment5.Module14;

import java.util.*;

class GraphTraversal {
    static void dfs(int node, boolean[] visited, List<List<Integer>> adj) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int nei : adj.get(node)) {
            if (!visited[nei])
                dfs(nei, visited, adj);
        }
    }

    public static void main(String[] args) {
        int V = 4;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);

        System.out.print("Traversal: ");
        dfs(0, new boolean[V], adj);
    }
}