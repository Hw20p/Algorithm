import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {	
	static int[][] arr;
	static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
	static int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};
	static boolean[][] visited;
	static int w, h;
	
	public static void dfs(int x, int y) {
		visited[x][y] = true;
		
		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx >= 0 && nx < h && ny >= 0 && ny < w) {
				if (arr[nx][ny] == 1 && !visited[nx][ny]) {
					dfs(nx, ny);
				}
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            
            if (w == 0 && h == 0) break;
        	
            visited = new boolean[h][w];
        	arr = new int[h][w];
        	for (int i = 0; i < h; i++) {
        		int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        		for (int j = 0; j < w; j++) {
        			arr[i][j] = input[j];
        		}
        	}
        	
        	int answer = 0;
        	for (int i = 0; i < h; i++) {
        		for (int j = 0; j < w; j++) {
        			if (arr[i][j] == 1 && !visited[i][j]) {
        				dfs(i, j);
        				answer++;
        			}
        		}
        	}
        	System.out.println(answer);
        }
    }
}
