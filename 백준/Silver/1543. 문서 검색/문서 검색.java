import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		String b = br.readLine();
		int answer = 0;
		
		for (int i = 0; i <= a.length() - b.length(); ) {
			if (a.substring(i, i + b.length()).equals(b)) {
				answer++;
				i += b.length();
			} else {
				i++;
			}
		}
		System.out.println(answer);
	}
}
