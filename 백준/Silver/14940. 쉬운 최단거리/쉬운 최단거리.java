import java.io.*;
import java.util.*;

public class Main {	
	static int[][] arr;
	static Queue<int[]> queue = new LinkedList<>();
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static int n, m;
	
	public static void bfs() {
		while (!queue.isEmpty()) {
			int[] curr = queue.poll();
			int cx = curr[0], cy = curr[1];
			
			for (int i = 0; i < 4; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				
				if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if (arr[nx][ny] == -1) {
						arr[nx][ny] = arr[cx][cy] + 1;
						queue.add(new int[] {nx, ny});
					}
				}
			}
		}
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력
		String[] input = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);

		arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			input = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(input[j]);
				
				// 올바른 출력을 위해 초깃값을 다시 지정해 줘야 함.
				if (arr[i][j] == 2) {
					arr[i][j] = 0;
					queue.add(new int[] {i, j});
				} else if (arr[i][j] == 1) {
					arr[i][j] = -1;
				}
			}
		}
		
		// 탐색
		bfs();
		
		// 출력
		for (int[] i : arr) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}