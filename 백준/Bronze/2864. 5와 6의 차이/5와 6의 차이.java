import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		
		// 최솟값
		int a = Integer.parseInt(input[0].replace("6", "5"));
		int b = Integer.parseInt(input[1].replace("6", "5"));
		System.out.print((a + b) + " ");
				
		// 최댓값
		a = Integer.parseInt(input[0].replace("5", "6"));
		b = Integer.parseInt(input[1].replace("5", "6"));
		System.out.println(a + b);
	}
}