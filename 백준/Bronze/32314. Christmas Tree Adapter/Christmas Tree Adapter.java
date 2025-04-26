import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int w = Integer.parseInt(input[0]);
		int v = Integer.parseInt(input[1]);
		
		int aa = w / v;
		System.out.println(a <= aa ? 1 : 0);
	}
}
