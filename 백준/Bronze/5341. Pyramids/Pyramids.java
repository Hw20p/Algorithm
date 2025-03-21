import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static int f(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			System.out.println(f(n));
		}
	}
}
