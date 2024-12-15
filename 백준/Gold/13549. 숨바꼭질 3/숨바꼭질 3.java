import java.io.*;
import java.util.*;

public class Main {    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int size = 100000;
        
        boolean[] visited = new boolean[size + 1];
        int[] dist = new int[size + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        visited[n] = true;
        dist[n] = 0;
        
        Deque<Integer> deque = new LinkedList<>();
        deque.add(n);
        
        while (!deque.isEmpty()) {
            int idx = deque.poll();
            
            // 세 가지 이동 방법
            int a = idx - 1;
            int b = idx + 1;
            int c = idx * 2;
            
            // 1. a (n-1) 이동
            if (a >= 0 && a <= size && dist[a] > dist[idx] + 1) {
                dist[a] = dist[idx] + 1;
                if (!visited[a]) {
                    deque.addLast(a); // 가중치가 1인 경우 뒤에 추가
                    visited[a] = true;
                }
            }
            
            // 2. b (n+1) 이동
            if (b >= 0 && b <= size && dist[b] > dist[idx] + 1) {
                dist[b] = dist[idx] + 1;
                if (!visited[b]) {
                    deque.addLast(b); // 가중치가 1인 경우 뒤에 추가
                    visited[b] = true;
                }
            }
            
            // 3. c (n*2) 이동
            if (c >= 0 && c <= size && dist[c] > dist[idx]) { // 가중치 0
                dist[c] = dist[idx];
                if (!visited[c]) {
                    deque.addFirst(c); // 가중치 0인 경우 앞에 추가
                    visited[c] = true;
                }
            }
        }
        
        System.out.println(dist[k]);
    }
}
