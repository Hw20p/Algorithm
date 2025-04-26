import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");
		int t1 = Integer.parseInt(input[0]);
		int t2 = Integer.parseInt(input[1]);
		
		System.out.println(t1 <= t2 ? t1 : t2);
	}
}
