import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		for (int i : input) {
			if (i == 9) {
				System.out.println("F"); 
				return;
			}
		}
		System.out.println("S");
	}
}
