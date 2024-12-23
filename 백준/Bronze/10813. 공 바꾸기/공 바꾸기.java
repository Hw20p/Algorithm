import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		int[] arr = new int[n + 1];
		
		for (int i = 1; i <= n; i++) {
			arr[i] = i;
		}
		
		for (int i = 0; i < m; i++) {
			input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
		
		for (int i = 1; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}