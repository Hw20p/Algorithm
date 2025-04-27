import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int total = arr[0] * arr[1];
		int answer = arr[2] - total;
		
		if (answer >= 0) System.out.println(0);
		else System.out.println(answer * -1);
	}
}
