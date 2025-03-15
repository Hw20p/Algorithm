import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String[] input = br.readLine().split(" ");
			int m = Integer.parseInt(input[0]);
			int f = Integer.parseInt(input[1]);
			
			if (m == 0 && f == 0) break;
			System.out.println(m + f);
		}
	}
}
