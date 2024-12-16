import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static int n, m;
	
	public static int dfs(int x, int y, int count) {
		visited[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
				if (arr[nx][ny] == 1 && !visited[nx][ny]) {
					count = dfs(nx, ny, count + 1);
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
		arr = new int[n][m];
		visited = new boolean[n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		List<Integer> list = new ArrayList<>();
		int answer = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 1 && !visited[i][j]) {
					int cnt = dfs(i, j, 1);
					list.add(cnt);
					answer++;
				}
			}
		}
		Collections.sort(list);
		System.out.println(answer);
		
		if (list.size() == 0) {
			System.out.println(0);
		} else {
			System.out.println(list.get(list.size() - 1));
		}
	}
}