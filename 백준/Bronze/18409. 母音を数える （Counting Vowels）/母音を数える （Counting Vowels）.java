import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] check = {'a', 'i', 'u', 'e', 'o'};
		
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int answer = 0;
		
		for (char i : s.toCharArray()) {
			for (char j : check) {
				if (i == j) answer++; 
			}
		}
		System.out.println(answer);
	}
}
