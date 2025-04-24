import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	static int f(int n) {
		return (int) (n + (double) (n * 0.1));
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		for (int i = 100; i <= 9900; i += 100) {
			if (f(i) == a) {
				System.out.println(i);
				break;
			}
		}
	}
}
