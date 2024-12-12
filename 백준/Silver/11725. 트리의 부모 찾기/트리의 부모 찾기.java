import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	static ArrayList<Integer>[] graph;
	static int[] answer;
	
	public static void dfs(int start) {
		for (int next : graph[start]) {
			if (answer[next] == 0) {
				answer[next] = start;
				dfs(next);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 노드
		int m = n - 1;	// 간선
		
		graph = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<>();
		}
		answer = new int[n + 1];
		
		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph[u].add(v);
			graph[v].add(u);
		}
		
		answer[1] = 1;
		dfs(1);
		
		for (int i = 2; i <= n; i++) {
			System.out.println(answer[i]);
		}
	}
}