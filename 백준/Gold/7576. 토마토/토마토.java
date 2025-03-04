import java.util.*;
import java.io.*;

public class Main {	
	static int n;
	static int m;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] arr;
	static Queue<int[]> queue = new LinkedList<>();
	
	// 시작 지점이 여러 개 있다면, FIFO이기 때문에 첫 시작 지점에서 x, y값이 add가 되었더라도 미리 저장해 두었던 
	// 두 번째 시작지점이 시작되는 것임. 때문에 서로 번갈아가며 진행을 한다. 
	public static void bfs() {
		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			int cx = cur[0];
			int cy = cur[1];
			
			for (int i=0; i<4; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				
				if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if (arr[nx][ny] == 0) {
						arr[nx][ny] = arr[cx][cy] + 1;
						queue.add(new int[] {nx, ny});
					}
				}
			}
		}
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (arr[i][j] == 1) {
					queue.add(new int[] {i, j});
				}
			}
		}
		bfs();
		
		int max = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				if (arr[i][j] == 0) {
					System.out.println(-1);
					return;
				}
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		System.out.println(max-1);
	}
}