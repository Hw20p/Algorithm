import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		long a = Long.parseLong(input[0]);
		long b = Long.parseLong(input[1]);
		long answer = (a + b) * (a - b);
		
		System.out.println(answer);
	}
}
