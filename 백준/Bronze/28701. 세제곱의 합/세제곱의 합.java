import java.io.*;
import java.util.*;

public class Main {
	static int f(int n) {
		if (n <= 1) 
			return 1;
		
		return n + f(n - 1);
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int res = (int) Math.pow(f(n), 2);
		
		System.out.println(f(n));
		System.out.printf("%d\n%d", res, res);
	}
}
