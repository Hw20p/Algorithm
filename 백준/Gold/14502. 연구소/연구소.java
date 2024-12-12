import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	static int n, m;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static int[][] arr;
	static int maxArea = 0;
	
	public static void bfs(int[][] tArr) {
		Queue<int[]> queue = new LinkedList<>();
		
		// 초기 바이러스 위치
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (tArr[i][j] == 2) queue.add(new int[] {i, j});
			}
		}
		
		while (!queue.isEmpty()) {
			int[] curr = queue.poll();
			int cx = curr[0], cy = curr[1];
			
			for (int i = 0; i < 4; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				
				if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if (tArr[nx][ny] == 0) {
						tArr[nx][ny] = 2;
						queue.add(new int[] {nx, ny});
					}
				}
			}
		}
	}
	
	public static void setWalls(int d) {
		if (d == 3) {
			int[][] tArr = new int[n][m];
			for (int i = 0; i < n; i++) {
				tArr[i] = arr[i].clone();
			}
			
			bfs(tArr);
			
			int count = 0;
			for (int i = 0; i < n; i++) {
				for (int j =0 ; j < m; j++) {
					if (tArr[i][j] == 0) count++;
				}
			}
			maxArea = Math.max(maxArea, count);
			return;
		}
		
		// 벽 설치
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 0) {
					arr[i][j] = 1; // 벽 설치
					setWalls(d + 1);
					arr[i][j] = 0; // 벽 초기화 (스택에 쌓인 후, d가 3이 되면 LIFO)
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		n = input[0];
		m = input[1];
		arr = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		setWalls(0);
		System.out.println(maxArea);
		
	}
}
