import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] parts = br.readLine().split("-");
		
		int answer = 0;
		
		// 첫 숫자 구하기..
		String[] firstPart = parts[0].split("\\+");
		for (String num : firstPart) answer += Integer.parseInt(num);
		
		// 첫 숫자에서 - 계산
		for (int i = 1; i < parts.length; i++) {
			String[] part = parts[i].split("\\+");
			int sum = 0;
			
			for (String num : part) sum += Integer.parseInt(num);
			answer -= sum;
		}
		System.out.println(answer);
	}
}