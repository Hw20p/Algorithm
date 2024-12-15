import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {	
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static int m, n;
	
	public static int dfs(int x, int y, int cnt) {
		visited[x][y] = true;
		cnt++;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
				if (arr[nx][ny] == 0 && !visited[nx][ny]) {
					cnt = dfs(nx, ny, cnt);
				}
			}
		}
		return cnt;
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] mnk = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = mnk[2];
        m = mnk[0];
        n = mnk[1];
        arr = new int[m][n];
        visited = new boolean[m][n];
        
        // 영역 전개
        for (int ii = 0; ii < k; ii++) {
        	int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        	int x1 = input[0], y1 = input[1];
        	int x2 = input[2], y2 = input[3];
        	
        	for (int i = y1; i < y2; i++) {
        		for (int j = x1; j < x2; j++) {
        			arr[i][j] = 1;
        		}
        	}
        }
        
        // 영역 개수, 넓이
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < n; j++) {
        		if (arr[i][j] == 0 && !visited[i][j]) {
        			int area = dfs(i, j, 0);
        			list.add(area);
        			count++;
        		}
        	}
        }
        
        // 결과 출력 
        System.out.println(count);
        Collections.sort(list);
        for (int i : list) System.out.print(i + " ");
    }
}
