import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		int count = 0;
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			if (ch == 'X') count++;
			else {
				if (count % 2 != 0) {
					System.out.println(-1);
					return;
				}
				sb.append("AAAA".repeat(count / 4));
				sb.append("BB".repeat((count % 4) / 2));
				sb.append(".");
				count = 0;
			}
		}
		
		// 마지막 응가 
		if (count % 2 != 0) {
			System.out.println("-1");
			return;
		}
		sb.append("AAAA".repeat(count / 4));
        sb.append("BB".repeat((count % 4) / 2));

        System.out.println(sb);
	}
}
