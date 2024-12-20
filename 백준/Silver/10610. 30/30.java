import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		List<Character> list = new ArrayList<>();
		
		for (char ch : input.toCharArray()) {
			list.add(ch);
		}
		
		Collections.sort(list, Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		
		int sum = 0; 
		for (int i = 0; i < list.size(); i++) {
			int n = list.get(i) - '0';
			sb.append(n);
			sum += n;
		}
		
		// 각 자릿수의 합이 3의 배수이면서 마지막 숫자가 0이면 30의 배수이다. 
		if (sum % 3 != 0 || list.get(list.size() - 1) != '0') {
			System.out.println(-1);
			return;
		}
		System.out.println(sb);
	}
}