import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int a1 = Integer.parseInt(st.nextToken());
		int b1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int a2 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());
		
		int lcm = lcm(b1, b2);
		int a = a1 * (lcm / b1) + a2 * (lcm / b2);
		int b = lcm;
		int gcd = gcd(a, b);
		
		System.out.println(a / gcd + " " + b / gcd);
	}
	
	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}
