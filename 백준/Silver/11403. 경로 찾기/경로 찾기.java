import java.io.*;
import java.util.*;

public class Main {	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        
        for (int i = 0; i < n; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for (int j = 0; j < n; j++) {
        		arr[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        
        // 플로이드-워셜 알고리즘
        for (int k = 0; k < n; k++) {
        	for (int i = 0; i < n; i++) {
        		for (int j = 0; j < n; j++) {
        			if (arr[i][k] == 1 && arr[k][j] == 1) {
        				arr[i][j] = 1;
        			}
        		}
        	}
        }
        
        // 결과 출력
        for (int[] i : arr) {
        	for (int j : i) {
        		System.out.print(j + " ");
        	}
        	System.out.println();
        }
    }
}
