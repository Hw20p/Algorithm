import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	static int n;
	static char[][] arr;
	static boolean[][] visited;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	
	public static void dfs(int x, int y, char color) {
		visited[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
				if (arr[nx][ny] == color && !visited[nx][ny]) {
					visited[nx][ny] = true;
					dfs(nx, ny, color);
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		arr = new char[n][n];
		visited = new boolean[n][n];
		
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			for (int j = 0; j < n; j++) {
				arr[i][j] = input.charAt(j);
			}
		}
		
		// 적록색약이 아닌 경우
		int answer = 0;
		char[] color = {'R', 'G', 'B'};
		for (char ch : color) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (!visited[i][j] && arr[i][j] == ch) {
						dfs(i, j, ch);
						answer++;
					}
				}
			}
		}
		System.out.print(answer + " ");
		
		
		// 적록색약인 경우
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 'R') arr[i][j] = 'G';
			}
		}
		
		int answer2 = 0;
		char[] color2 = {'G', 'B'};
		for (int i = 0; i < n; i++) {
			Arrays.fill(visited[i], false);
		}

		for (char ch : color2) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (!visited[i][j] && arr[i][j] == ch) {
						dfs(i, j, ch);
						answer2++;
					}
				}
			}
		}
		System.out.print(answer2);
	}
}
