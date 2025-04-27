import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int e = arr[0], s = arr[1], m = arr[2];
		int E = 0, S = 0, M = 0;
		int answer = 0;
		
		while (true) {
			if (E == e && S == s && M == m) break;
			answer++;

			E = E % 15 + 1;
			S = S % 28 + 1;
			M = M % 19 + 1;
		}
		
		System.out.println(answer);
	}
}
