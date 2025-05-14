import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String temp;
		int min = 5;
		String res = "";

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			temp = st.nextToken();
			int num  = Integer.parseInt(st.nextToken());
			if (min > num) {
				min = num;
				res = temp;
			}
		}
		System.out.println(res);
	}
}
