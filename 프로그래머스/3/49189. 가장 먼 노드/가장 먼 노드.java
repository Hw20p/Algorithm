import java.io.*;
import java.util.*;

class Solution {
    static int[] dist; 
	static ArrayList<Integer>[] graph;
    
    public int solution(int n, int[][] edge) {
        dist = new int[n + 1];
		Arrays.fill(dist, -1);
		
		Queue<Integer> queue = new LinkedList<>();
		
		graph = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < edge.length; i++) {
			int u = edge[i][0];
			int v = edge[i][1];
			graph[u].add(v);
			graph[v].add(u);
		}
		
		
		dist[1] = 0;
		queue.add(1);
		
		while (!queue.isEmpty()) {
			int node = queue.poll();
			
			for (int next : graph[node]) {
				if (dist[next] == -1) {
					dist[next] = dist[node] + 1;
					queue.add(next);
				}
			}
		}
		
		int max = 0;
		for (int i : dist) {
			if (i > max) {
				max = i;
			}
		}
		
		int count = 0;
		for (int i : dist) {
			if (i == max) {
				count++;
			}
		}
		
		return count;
    }
}