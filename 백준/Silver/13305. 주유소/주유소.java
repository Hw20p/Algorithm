import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] dist = new int[n - 1];
		int[] price = new int[n];
		
		// 입력
		String[] input = br.readLine().split(" ");
		for (int i = 0; i < n - 1; i++) {
			dist[i] = Integer.parseInt(input[i]);
		}
		input = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			price[i] = Integer.parseInt(input[i]);
		}
		
		// 구현
		long sum = 0; 
		long min = price[0];
		
		for (int i = 0; i < dist.length; i++) {
			if (price[i] < min) min = price[i];
			sum += min * dist[i];
		}
		System.out.println(sum);
	}
}