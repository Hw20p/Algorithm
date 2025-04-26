import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int s1 = Integer.parseInt(input[0]), s2 = Integer.parseInt(input[1]);
		
		if ((double) s2 / s1 <= 2.0) System.out.println("E");
		else System.out.println("H");
	}
}
