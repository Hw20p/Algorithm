import java.io.*;
import java.util.*;

public class Main {    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int size = 100_000;
        
        // 방문 여부
        boolean[] visited = new boolean[size + 1];
        visited[n] = true;
        
        // BFS
        Deque<Integer> dq = new LinkedList<>();
        dq.add(n);
        
        // 최단 거리
        int[] dist = new int[size + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[n] = 0;
        
        // 경로 수
        int[] count = new int[size + 1];
        count[n] = 1;
        
        while (!dq.isEmpty()) {
        	int idx = dq.poll();
        	
        	int a = idx - 1;
        	int b = idx + 1;
        	int c = idx * 2;
        	
        	if (a >= 0 && a <= size && dist[a] > dist[idx] + 1) {
        		dist[a] = dist[idx] + 1;
        		count[a] = count[idx];
        		if (!visited[a]) {
        			dq.addLast(a);
        			visited[a] = true;
        		}
        	} else if (a >= 0 && a <= size && dist[a] == dist[idx] + 1) {
        		count[a] += count[idx];
        	}

        	if (b >= 0 && b <= size && dist[b] > dist[idx] + 1) {
        		dist[b] = dist[idx] + 1;
        		count[b] = count[idx];
        		if (!visited[b]) {
        			dq.addLast(b);
        			visited[b] = true;
        		}
        	} else if (b >= 0 && b <= size && dist[b] == dist[idx] + 1) {
        		count[b] += count[idx];
        	}
        	
        	if (c >= 0 && c <= size && dist[c] > dist[idx] + 1) {
        		dist[c] = dist[idx] + 1;
        		count[c] = count[idx];
        		if (!visited[c]) {
        			dq.addLast(c);
        			visited[c] = true;
        		}
        	} else if (c >= 0 && c <= size && dist[c] == dist[idx] + 1) {
        		count[c] += count[idx];
        	}
        }
        System.out.println(dist[k]);
        System.out.println(count[k]);
    }
}
