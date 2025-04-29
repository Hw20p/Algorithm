import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int answer = 0; 
		
		for (int i = 1; i <= n; i++) {
			int sum = 0; 
			for (int j = i; j <= n; j++) {
				sum += j;
				
				if (sum > n) break;
				else if (sum == n) {
					answer++;
					break;
				}
			}
		}
		System.out.println(answer);
	}
}
