import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		
		if (n >= 12 && n <= 16) {
			if (m == 0) {
				System.out.println(320);
			} else {
				System.out.println(280);
			}
		} else {
			System.out.println(280);
		}
	}
}
