import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int answer1 = (int)((double) n - (n * 0.22));
		int answer2 = (int)((double) n - (n * 0.2 * 0.22));
		
		System.out.println(answer1 + " " + answer2);
	}
}
