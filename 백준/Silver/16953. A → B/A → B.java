import java.io.*;
import java.util.*;

public class Main {	
	static int m;
	static boolean[] visited;
	static Queue<int[]> queue = new LinkedList<>();
	
	public static void bfs() {
		while (!queue.isEmpty()) {
			int[] curr = queue.poll();
			int start = curr[0];
			int steps = curr[1];
			long a = (long) start * 2;
			long b = (long) start * 10 + 1;
			
			// 연산 1
			if (a <= m && !visited[(int) a]) {
				if (a == m) {
					System.out.println(steps + 1);
					return;
				}
				queue.add(new int[] {(int) a, steps + 1});
				visited[(int) a] = true;
			}
			
			// 연산 2
			if (b <= m && !visited[(int) b]) {
				if (b == m) {
					System.out.println(steps + 1);
					return;
				}
				queue.add(new int[] {(int) b, steps + 1});
				visited[(int) b] = true;
			}
		}
		System.out.println(-1);
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        visited = new boolean[m + 1];
        visited[n] = true;
        queue.add(new int[] {n, 1});
        
        bfs();
    }
}