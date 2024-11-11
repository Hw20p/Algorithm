import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = 2 * n - 1;
		for (int i = 1; i <= m; i++) {
			if (i <= n) {
				System.out.println("*".repeat(i));
			} else {
				System.out.println("*".repeat(m - i + 1));
			}
			
		}
	}
}