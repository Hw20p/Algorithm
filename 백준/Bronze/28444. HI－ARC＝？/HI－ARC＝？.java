import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int first = 1, second = 1;
		for (int i = 0; i < 2; i++) first *= input[i];
		for (int i = 2; i < 5; i++) second *= input[i];
		
		System.out.println(first - second);
	}
}
