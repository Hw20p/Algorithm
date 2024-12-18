import java.io.*;
import java.util.*;

public class Main {	
	static char[][] arr;
	static Queue<int[]> queue = new LinkedList<>();
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static int n, m;
	
	public static int bfs() {
		int count = 0;
		
		while (!queue.isEmpty()) {
			int[] curr = queue.poll();
			int cx = curr[0], cy = curr[1];
			
			for (int i = 0; i < 4; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				
				if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if (arr[nx][ny] == 'O' || arr[nx][ny] == 'P') {
						if (arr[nx][ny] == 'P') count++;
						arr[nx][ny] = 'v';
						queue.add(new int[] {nx, ny});
					}
				}
			}
		}
		return count;
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new char[n][m];
		
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			for (int j = 0; j < m; j++) {
				arr[i][j] = input.charAt(j);
				if (arr[i][j] == 'I') queue.add(new int[] {i, j});
			}
		}
		
		int answer = bfs();
		System.out.println(answer == 0 ? "TT" : answer);
	}
}