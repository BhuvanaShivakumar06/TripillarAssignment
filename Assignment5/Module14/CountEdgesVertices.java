package Assignment5.Module14;

import java.util.ArrayList;
import java.util.List;

public class CountEdgesVertices {
    public static void main(String[] args) {
        int V = 3;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(0);

        int edges = 0;
        for (List<Integer> list : adj)
            edges += list.size();

        edges /= 2;

        System.out.println("Vertices: " + V);
        System.out.println("Edges: " + edges);
    }
}
