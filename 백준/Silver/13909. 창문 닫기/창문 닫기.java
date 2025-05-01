import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int answer = 0;
		for (int i = 1; i * i <= n; i++) {
			answer++;
		}
		System.out.println(answer);
	}
}
