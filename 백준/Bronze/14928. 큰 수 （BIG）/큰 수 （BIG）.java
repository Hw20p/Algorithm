import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String n = br.readLine();
		int mod = 20000303;
		int remainder = 0;
		
		for (int i = 0; i < n.length(); i++) {
			remainder = (remainder * 10 + (n.charAt(i) - '0')) % mod;
		}
		
		System.out.println(remainder);
	}
}
