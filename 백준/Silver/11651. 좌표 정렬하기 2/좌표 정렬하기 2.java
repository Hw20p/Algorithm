import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int i;
		
		int[][] arr = new int[n][2];
		
		for (i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			
		}
		Arrays.sort(arr, (a, b) -> {
		    if (a[1] != b[1]) {
		        return Integer.compare(a[1], b[1]);
		    } else {
		        return Integer.compare(a[0], b[0]);
		    }
		});
		
		for (i=0; i<n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}
