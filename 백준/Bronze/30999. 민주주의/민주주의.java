import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int answer = 0;
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			int check = 0;
			
			for (char ch : s.toCharArray()) {
				if (ch == 'O') {
					check++;
				}
			}
			
			if (m - check < check) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}
