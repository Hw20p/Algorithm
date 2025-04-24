import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		if (arr[0] > arr[2] || arr[1] < arr[2]) {
			System.out.println("Bus");
		} else if (arr[1] > arr[2]) {
			System.out.println("Subway");
		} else {
			System.out.println("Anything");
		}
	}
}
