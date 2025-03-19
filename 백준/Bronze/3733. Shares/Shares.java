import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input;
		while ((input = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(input, " ");
			int n = Integer.parseInt(st.nextToken()) + 1;
			int s = Integer.parseInt(st.nextToken());
			
			System.out.println(s / n);
		}
	}
}
