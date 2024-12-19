import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 1000 - Integer.parseInt(br.readLine());
		int[] arr = {500, 100, 50, 10, 5, 1};
		int answer = 0;
		
		for (int i = 0; i < arr.length; i++) {
			answer += n / arr[i];
			n %= arr[i];
		}
		System.out.println(answer);
	}
}