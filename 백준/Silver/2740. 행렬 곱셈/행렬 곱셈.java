import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 행렬 A
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr1 = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr1[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 행렬 B
		st = new StringTokenizer(br.readLine());
		int m2 = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[][] arr2 = new int[m2][k];
		
		for (int i = 0; i < m2; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < k; j++) {
				arr2[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 행렬 A * B
		int[][] arr3 = new int[n][k];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				for (int l = 0; l < m; l++) {
					arr3[i][j] += arr1[i][l] * arr2[l][j];
				}
			}
		}
		
		// 출력
		StringBuilder sb = new StringBuilder();
		for (int[] i : arr3) {
			for (int j : i) {
				sb.append(j + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
