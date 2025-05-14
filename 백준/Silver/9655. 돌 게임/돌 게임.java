import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int i = 0;

		while (n > 0) {
			if (n % 3 == 0) {
				n -= 3;
			} else {
				n -= 1;
			}
			i++;
		}
		System.out.println(i % 2 != 0 ? "SK" : "CY");
	}
}
