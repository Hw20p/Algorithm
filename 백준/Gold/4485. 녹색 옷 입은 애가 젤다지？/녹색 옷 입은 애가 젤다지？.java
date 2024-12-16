import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	static int[][] arr;
	static int[][] dist;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static int n;
	
	public static void dijkstra() {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {0, 0, arr[0][0]}); // x, y, 비용
		dist[0][0] = arr[0][0]; // 시작점 비용 초기화
		
		while (!queue.isEmpty()) {
			int[] curr = queue.poll();
			int cx = curr[0];
			int cy = curr[1];
			int cost = curr[2];
			
			if (cost > dist[cx][cy]) continue; // 이미 처리된 경우 스킵
			
			for (int i = 0; i < 4; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				
				if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
					int nCost = cost + arr[nx][ny];
					if (nCost < dist[nx][ny]) {
						dist[nx][ny] = nCost;
						queue.add(new int[] {nx, ny, nCost});
					}
				}
			}
		}
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int idx = 1;
		while (true) {
			n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			
			arr = new int[n][n];
			dist = new int[n][n];
			for (int i = 0; i < n; i++) {
				Arrays.fill(dist[i], Integer.MAX_VALUE); // 초기 비용 설정
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
					
				}
			}
			
			dijkstra();
			
			System.out.println("Problem " + idx + ": " + dist[n - 1][n - 1]);
			idx++;
		}
	}
}