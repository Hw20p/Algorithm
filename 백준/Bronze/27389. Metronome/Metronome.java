import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if (n % 4 == 0) System.out.printf("%.1f", n / 4.0);
		else System.out.printf("%.2f", n / 4.0);
	}
}
