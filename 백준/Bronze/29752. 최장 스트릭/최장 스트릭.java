import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int day = 0, max = 0;
		for (int i : arr) {
			if (i != 0) {
				day++;
				if (day > max) {
					max = day;
				}
			} else {
				if (day > max) {
					max = day;
				}
				day = 0;
			}
		}
		
		System.out.println(max);
	}
}