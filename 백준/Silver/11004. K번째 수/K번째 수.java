import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		
		for (int i = 0; i < n; i++) {
			heap.offer(Integer.parseInt(st.nextToken()));
		}
		
		int answer = 0;
		for (int i = 0; i < k; i++) {
			answer = heap.poll(); // 가장 작은 값 꺼내고 제거
		}

		System.out.println(answer);
	}
}
