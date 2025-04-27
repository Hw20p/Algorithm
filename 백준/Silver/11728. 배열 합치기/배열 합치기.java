import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		// 병합 정렬 
		int[] arr = new int[n + m];
		int i = 0, j = 0, k = 0;
		while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }
        
        while (i < n) {
            arr[k++] = arr1[i++];
        }
        
        while (j < m) {
            arr[k++] = arr2[j++];
        }
		
        StringBuilder sb = new StringBuilder();
		for (int num : arr) {
			sb.append(num).append(" ");
		}
		System.out.println(sb.toString().trim());
	}
}
