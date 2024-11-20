import java.util.*;
import java.io.*;

class Solution {
    static int n, m;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    
    public void bfs(int x, int y, int[][] maps) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});
        
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int cx = curr[0];
            int cy = curr[1];
            
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (maps[nx][ny] == 1) {
                        maps[nx][ny] = maps[cx][cy] + 1;
                        queue.add(new int[] {nx, ny});
                    }
                }
            }
        }
    }
    
    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        
        bfs(0, 0, maps);
        return maps[n - 1][m - 1] > 1 ? maps[n - 1][m - 1] : -1;
    } 
}