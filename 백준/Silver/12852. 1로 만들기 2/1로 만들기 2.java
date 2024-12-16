import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int size = 1_000_000;
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(n);
		
		boolean[] visited = new boolean[size + 1];
		visited[n] = true;
		
		int[] dist = new int[size + 1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[n] = 0;
		
		int[] parent = new int[size + 1];
		Arrays.fill(parent, -1);
		
		while (!queue.isEmpty()) {
			int idx = queue.poll();
			
			int a = idx - 1;
			int b = idx / 3;
			int c = idx / 2;
			
			if (a > 0 && a <= size && dist[a] > dist[idx] + 1) {
				dist[a] = dist[idx] + 1;
				parent[a] = idx;
				if (!visited[a]) {
					queue.add(a);
					visited[a] = true;
				}
			}
			
			if (b > 0 && b <= size && idx % 3 == 0 && dist[b] > dist[idx] + 1) {
				dist[b] = dist[idx] + 1;
				parent[b] = idx;
				if (!visited[b]) {
					queue.add(b);
					visited[b] = true;
				}
			}
			
			if (c > 0 && c <= size && idx % 2 == 0 && dist[c] > dist[idx] + 1) {
				dist[c] = dist[idx] + 1;
				parent[c] = idx;
				if (!visited[c]) {
					queue.add(c);
					visited[c] = true;
				}
			}
		}
		System.out.println(dist[1]);
		
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i != -1; i = parent[i]) {
			list.add(i);
		}
		Collections.reverse(list);
		for (int i : list) {
			System.out.print(i + " ");
		}
	}
}