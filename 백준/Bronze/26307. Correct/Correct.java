import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int hh = Integer.parseInt(input[0]);
		int mm = Integer.parseInt(input[1]);
		
		System.out.println(Math.abs(9 - hh) * 60 + mm);
	}
}
