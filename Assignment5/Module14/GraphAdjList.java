package Assignment5.Module14;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjList {
    public static void main(String[] args) {
        int V = 4;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(0);

        System.out.println("Adjacency List: " + adj);
    }
}
