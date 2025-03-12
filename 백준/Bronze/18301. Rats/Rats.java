import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] n = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int answer = (int) Math.floor((n[0] + 1) * (n[1] + 1) / (n[2] + 1) - 1);
		System.out.println(answer);
		
	}
}
