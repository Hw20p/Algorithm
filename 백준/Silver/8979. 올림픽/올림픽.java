import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]); // 국가의 수
		int k = Integer.parseInt(input[1]); // 등수를 알고 싶은 국가
		
		// k 국가의 등수 확인 
		int[][] arr = new int[n][4];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 4; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		Arrays.sort(arr, (a, b) -> {
			if (a[1] != b[1]) return Integer.compare(b[1], a[1]);
			else if (a[2] != b[2]) return Integer.compare(b[2], a[2]);
			else return Integer.compare(b[3], a[3]);
		});
	
		
		int rank = 1;
		for (int i = 1; i < n; i++) {
			if (arr[i][1] != arr[i - 1][1] ||
		        arr[i][2] != arr[i - 1][2] ||
		        arr[i][3] != arr[i - 1][3]) {
				rank = i + 1;
			} 
			
			if (arr[i][0] == k) {
		        System.out.println(rank);
		        break;
		    }
		}
	}
}
