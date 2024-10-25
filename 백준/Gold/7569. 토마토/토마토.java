import java.io.*;
import java.util.*;

public class Main {
	static int x, y, z;
	static int[] dx = {0, 0, 1, 0, 0, -1};
	static int[] dy = {1, 0, 0, -1, 0, 0};
	static int[] dz = {0, 1, 0, 0, -1, 0};
	static int[][][] arr;
	static Queue<int[]> queue = new LinkedList<>(); 
	
	public static void bfs() {
		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			int cx = cur[0];
			int cy = cur[1];
			int cz = cur[2];
			
			for (int i = 0; i < 6; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				int nz = cz + dz[i];
				
				if (nx >= 0 && nx < x && ny >= 0 && ny < y && nz >= 0 && nz < z) {
					if (arr[nz][ny][nx] == 0) {
						arr[nz][ny][nx] = arr[cz][cy][cx] + 1;
						queue.add(new int[] {nx, ny, nz});
					}
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		z = Integer.parseInt(st.nextToken());
		
		arr = new int[z][y][x];
		
		for (int i = 0; i < z; i++) {
			for (int j = 0; j < y; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < x; k++) {
					arr[i][j][k] = Integer.parseInt(st.nextToken());
					if (arr[i][j][k] == 1) {
						queue.add(new int[] {k, j, i});
					}
				}
			}
		}
		
		bfs();
		
		int max = 0;
		for (int i = 0; i < z; i++) {
			for (int j = 0; j < y; j++) {
				for (int k = 0; k < x; k++) {
					if (arr[i][j][k] > max) {
						max = arr[i][j][k];
					}
					if (arr[i][j][k] == 0) {
						System.out.println(-1);
						return;
					}
				}
			}
		}
		System.out.println(max - 1);
	}
}
