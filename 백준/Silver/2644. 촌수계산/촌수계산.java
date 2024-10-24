import java.io.*;
import java.util.*;

public class Main {
	static ArrayList<Integer>[] graph;
	static int[] dist;
	
	public static void bfs(int sNode) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(sNode);
		dist[sNode] = 0;
		
		while (!queue.isEmpty()) {
			int node = queue.poll();
			
			for (int next : graph[node]) {
				if (dist[next] == -1) {
					dist[next] = dist[node] + 1;
					queue.add(next);
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[n+1];
		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<>(); 
		}
		
		dist = new int[n+1];
		Arrays.fill(dist, -1);
		
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph[u].add(v);
			graph[v].add(u);
		}
		
		bfs(x);
		
		if (dist[y] == - 1) {
			System.out.println(-1);
		} else {
			System.out.println(dist[y]);
		}
		
	}
}