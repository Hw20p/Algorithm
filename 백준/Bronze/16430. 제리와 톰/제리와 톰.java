import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int p = Integer.parseInt(input[0]);
		int q = Integer.parseInt(input[1]);
		int r = q - p;
		
		System.out.println(r + " " + q);
	}
}
