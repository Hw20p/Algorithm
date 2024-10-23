import java.io.*;
import java.util.*;

public class Main {
	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		for (int i = 1; i <= s.length(); i++) {
			System.out.print(s.charAt(i-1));
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}
}