import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] arr = {56, 24, 14, 6};
		int answer = 0;
		
		for (int i = 0; i < 4; i++) {
			answer += arr[i] * input[i];
		}
		
		System.out.println(answer);
	}
}
