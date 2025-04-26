import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] nums = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int l = 0, r = 0;
		
		for (int i : nums) {
			if (i % 2 == 0) {
				l++;
			} else {
				r++;
			}
		}
		
		System.out.println(l > r ? "Happy" : "Sad");
	}
}
