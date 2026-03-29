package Assignment5.Module14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public List<Integer> topoSort (int V , ArrayList<ArrayList<Integer>> adj){
        int[] inDegree = new int[V];
        // Step 1 - Calculate the in-degree of all nodes
        for (int i=0; i<V; i++){
            for (int neighbour : adj.get(i)){
                inDegree[neighbour]++;
            }
        }
        // Step 2 - dd all nodes with in-Degree 0 into the queue
        Queue<Integer> q = new LinkedList<>();
        for (int i =0; i<V; i++){
            if (inDegree[i] == 0){
                q.add(i);
            }
        }
        // step 3 : BFS Call
        List<Integer> topo = new ArrayList<>();
        while (!q.isEmpty()){
            int node = q.poll();
                topo.add(node); // Store it in the answer(topo sort)
            //reduce the indegree of the adjacent nodes
            //while reducing if in-degree becomes 0 , push the node to the queue
            for (int neighbour : adj.get(node)){
                inDegree[neighbour]--;
                if (inDegree[neighbour] == 0){
                    q.add(neighbour);
                }
            }
        }
        return topo;
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        // We have to initialize with empty arrays
        for (int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);
        BFS obj = new BFS();
        List<Integer> ans = obj.topoSort(V,adj);
        System.out.println("The TopoSort Linear Ordering(BFS) u--> v is :");
        for (int node: ans){
            System.out.print(node + " ");
        }
        System.out.println();

    }
}
