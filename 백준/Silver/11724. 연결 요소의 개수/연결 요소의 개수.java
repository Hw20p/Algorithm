import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	static ArrayList<Integer>[] graph;
	static boolean[] visited;
	
	public static void dfs(int node) {
		visited[node] = true;
		
		for (int next : graph[node]) {
			if (!visited[next]) {
				dfs(next);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = input[0], m = input[1];
		
		graph = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<>();
		}
		visited = new boolean[n + 1];
		
		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			graph[u].add(v);
			graph[v].add(u);
		}
		
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				dfs(i);
				answer++;
			}
		}
		System.out.println(answer);
	}
}
