import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][4];
		String[] name = new String[n];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr[i][0] = i;
			name[i] = st.nextToken();
			
			for (int j = 1; j < 4; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		Arrays.sort(arr, (a, b) -> {
			if (a[3] != b[3]) return a[3] - b[3];
			else if (a[2] != b[2]) return a[2] - b[2];
			else return a[1] - b[1];
		});
	
		System.out.println(name[arr[n - 1][0]]);
		System.out.println(name[arr[0][0]]);
	}
}
