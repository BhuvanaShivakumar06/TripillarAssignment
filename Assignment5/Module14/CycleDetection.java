package Assignment5.Module14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetection {
    public boolean isCyclic (int V , ArrayList<ArrayList<Integer>> adj){
        int[] inDegree = new int[V + 1]; // 0- based indexing
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
        // step 3 : count the nodes processed in the Topo Sort
        int count =0;

        while (!q.isEmpty()){
            int node = q.poll();
               count++;// Store it in the answer(topo sort)
            //reduce the indegree of the adjacent nodes
            //while reducing if in-degree becomes 0 , push the node to the queue
            for (int neighbour : adj.get(node)){
                inDegree[neighbour]--;
                if (inDegree[neighbour] == 0){
                    q.add(neighbour);
                }
            }
        }
        // If all the nodes are processed , there is a no cycle
        // If even one single is not processed , there is a Cycle
        return count != V;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        // We have to initialize with empty arrays
        for (int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(4);
        adj.get(3).add(5);
        adj.get(4).add(2);

        CycleDetection obj = new CycleDetection();
        boolean ans = obj.isCyclic(V,adj);
        if (ans){
            System.out.println("Cycle Detected");
        }else {
            System.out.println("No Cycle Detected");
        }



    }
}
