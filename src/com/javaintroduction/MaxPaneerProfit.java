package com.javaintroduction;

import java.util.*;

public class MaxPaneerProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of cities
        int n = sc.nextInt();

        // Read the prices of paneer in each city
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Read the number of roads
        int m = sc.nextInt();

        // Read the source and destination cities of the roads
        int[] A = new int[m];
        int[] B = new int[m];
        for (int i = 0; i < m; i++) {
            A[i] = sc.nextInt() - 1; // Convert to zero-based index
        }
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt() - 1; // Convert to zero-based index
        }

        // Build adjacency list for the graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            graph.get(A[i]).add(B[i]);
        }

        // Initialize the maximum profit to the smallest possible value
        int maxProfit = Integer.MIN_VALUE;

        // Perform BFS from each city to calculate the maximum profit
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, getMaxProfitFromCity(i, prices, graph));
        }

        // Print the maximum profit found
        System.out.println(maxProfit);
        sc.close();
    }

    // Function to perform BFS and calculate the maximum profit from a given city
    private static int getMaxProfitFromCity(int start, int[] prices, List<List<Integer>> graph) {
        boolean[] visited = new boolean[prices.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        int maxProfit = Integer.MIN_VALUE;

        while (!queue.isEmpty()) {
            int currentCity = queue.poll();

            for (int neighbor : graph.get(currentCity)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                    maxProfit = Math.max(maxProfit, prices[neighbor] - prices[start]);
                }
            }
        }

        return maxProfit;
        
    }
}
