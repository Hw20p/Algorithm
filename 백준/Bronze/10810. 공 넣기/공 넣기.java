import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		int[] arr = new int[n + 1];
		
		for (int ii = 0; ii < m; ii++) {
			input = br.readLine().split(" ");
			int i = Integer.parseInt(input[0]);
			int j = Integer.parseInt(input[1]);
			int k = Integer.parseInt(input[2]);
			
			for (int jj = i; jj <= j; jj++) {
				arr[jj] = k;
			}
		}
		
		for (int i = 1; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}