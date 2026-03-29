package Assignment5.Module14;

import java.util.*;

public class BipartiteCheck {
    public static void main(String[] args) {
        int V = 4;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);

        int[] color = new int[V];
        Arrays.fill(color, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        color[0] = 0;

        boolean isBipartite = true;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int nei : adj.get(node)) {
                if (color[nei] == -1) {
                    color[nei] = 1 - color[node];
                    q.add(nei);
                } else if (color[nei] == color[node]) {
                    isBipartite = false;
                }
            }
        }

        System.out.println("Is Bipartite: " + isBipartite);
    }
}
