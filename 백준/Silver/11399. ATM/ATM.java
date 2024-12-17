import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		Arrays.sort(arr);
		
		int sum = 0;
		int answer = 0;
		for (int i : arr) {
			sum += i;
			answer += sum;
		}
		System.out.println(answer);
	}
}