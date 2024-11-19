import java.util.*;

class Solution {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int size = 101;

    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int[][] map = new int[size][size];

        // 좌표 확장 및 지도 생성
        for (int[] rect : rectangle) {
            int x1 = rect[0] * 2, y1 = rect[1] * 2;
            int x2 = rect[2] * 2, y2 = rect[3] * 2;

            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j <= y2; j++) {
                    // 외곽선은 1로, 내부는 2로 표시
                    if (i == x1 || i == x2 || j == y1 || j == y2) {
                        if (map[i][j] != 2) map[i][j] = 1;
                    } else {
                        map[i][j] = 2;
                    }
                }
            }
        }

        // BFS로 최단 경로 계산
        return bfs(map, characterX * 2, characterY * 2, itemX * 2, itemY * 2) / 2;
    }

    public int bfs(int[][] map, int startX, int startY, int endX, int endY) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[size][size];
        queue.add(new int[]{startX, startY, 0});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            int dist = curr[2];

            // 도착점에 도달하면 거리 반환
            if (x == endX && y == endY) {
                return dist;
            }

            // 네 방향으로 이동
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 유효한 외곽 경로인지 확인
                if (nx >= 0 && nx < size && ny >= 0 && ny < size && map[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, dist + 1});
                }
            }
        }

        return -1;
    }
}
