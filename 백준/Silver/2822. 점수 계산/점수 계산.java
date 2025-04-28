import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[8][2];
		int[][] tArr = new int[8][2];
		
		for (int i = 0; i < 8; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = new int[] {num, i};
			tArr[i] = new int[] {num, i};
		}
		
		Arrays.sort(arr, (a, b) -> Integer.compare(b[0], a[0]));
		
		int min = arr[4][0];
		int sum = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			if (tArr[i][0] >= min) {
				sb.append(++tArr[i][1] + " ");
				sum += tArr[i][0];
			}
		}
		
		System.out.println(sum);
		System.out.println(sb.toString());
	}
}
