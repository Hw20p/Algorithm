import java.io.*;
import java.util.*;

public class Main {
	static int[][] arr;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static boolean[][] visited;
	static int n;
	
	public static void dfs(int[][] tArr, int x, int y) {
		visited[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx >= 0 && nx < n && ny >=0 && ny < n) {
				if (tArr[nx][ny] != 0 && !visited[nx][ny]) {
					dfs(tArr, nx, ny);
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				max = Math.max(max, arr[i][j]);
			}
		}
		
		
		int maxAnswer = 0;
		for (int d = 0; d <= max; d++) {
			int[][] tArr = new int[n][n];
			visited = new boolean[n][n];
			
			// 높이 기준으로 침수 처리
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (arr[i][j] <= d) {
						tArr[i][j] = 0;
					} else {
						tArr[i][j] = arr[i][j];
					}
				}
			}
			
			// 안전 영역 탐색
			int answer = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (tArr[i][j] > 0 && !visited[i][j]) {
						dfs(tArr, i, j);
						answer++;
					}
				}
			}
			
			maxAnswer = Math.max(maxAnswer, answer);
		}
		System.out.println(maxAnswer);
	}
}