import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
			System.out.print(" ".repeat(n - i));
			System.out.println("*".repeat(i));
		}
		
		for (int i = 1; i < n; i++) {
			System.out.print(" ".repeat(i));
			System.out.println("*".repeat(n - i));
		}
	}
}
