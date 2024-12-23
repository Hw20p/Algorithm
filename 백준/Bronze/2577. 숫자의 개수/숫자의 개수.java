import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = a * b * c;
		String dd = Integer.toString(d);
		
		for (char ch : dd.toCharArray()) {
			arr[ch - '0']++;
		}
		
		for (int i : arr) System.out.println(i);
	}
}