import java.io.*;
import java.util.*;

class Solution {
    static Queue<int[]> queue = new LinkedList<>();
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int n, m;
    static int answer = 0;
    
    public void bfs(String[][] board, String color) {
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int cx = curr[0];
            int cy = curr[1];
            
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (board[nx][ny].equals(color)) {
                        System.out.println(board[nx][ny]);
                        answer++;
                    }   
                }
            }
        }
    }
    
    public int solution(String[][] board, int h, int w) {
        n = board.length;
        m = board[0].length;
        
        queue.add(new int[] {h, w});
        bfs(board, board[h][w]);
        
        return answer;
    }
}