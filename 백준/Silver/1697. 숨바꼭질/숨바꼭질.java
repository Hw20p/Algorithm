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
        visited[n] = true;
        
        int[] dist = new int[size + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[n] = 0;
        
        Deque<Integer> dq = new LinkedList<>();
        dq.add(n);
        
        while(!dq.isEmpty()) {
        	int idx = dq.poll();
        	
        	int a = idx + 1;
        	int b = idx - 1;
        	int c = idx * 2;
        	
        	if (a >= 0 && a <= size && dist[a] > dist[idx] + 1) {
        		dist[a] = dist[idx] + 1;
        		if (!visited[a]) {
        			dq.addLast(a);
        			visited[a] = true;
        		}
        	}
        	if (b >= 0 && b <= size && dist[b] > dist[idx] + 1) {
        		dist[b] = dist[idx] + 1;
        		if (!visited[b]) {
        			dq.addLast(b);
        			visited[b] = true;
        		}
        	}
        	if (c >= 0 && c <= size && dist[c] > dist[idx] + 1) {
        		dist[c] = dist[idx] + 1;
        		if (!visited[c]) {
        			dq.addLast(c);
        			visited[c] = true;
        		}
        	}
        }
        System.out.println(dist[k]);
    }
}
