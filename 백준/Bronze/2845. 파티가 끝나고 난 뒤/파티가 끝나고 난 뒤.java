import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] L = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] P = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int num = L[0] * L[1];
		for (int i : P) {
			System.out.print(i - num + " ");
		}
	}
}
