import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] time = {300, 60, 10};
		int[] answer = new int[3];
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < time.length; i++) {
			answer[i] = n / time[i];
			n %= time[i];
			sb.append(answer[i] + " ");
		}
		
		System.out.println(n == 0 ? sb.toString() : -1);
	}
}