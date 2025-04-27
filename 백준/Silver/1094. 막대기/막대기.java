import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int answer = 0;

		while (x > 0) {
			if (x % 2 == 1) answer++; 
			x /= 2;
		}
		
		System.out.println(answer);
	}
}
