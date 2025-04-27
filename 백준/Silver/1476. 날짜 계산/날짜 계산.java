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
			
			E++; S++; M++;
			E %= 16;
			S %= 29;
			M %= 20;
			
			if (E == 0) E++;
			if (S == 0) S++;
			if (M == 0) M++;
		}
		
		System.out.println(answer);
	}
}
