import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			HashMap<String, Integer> map = new HashMap<>();
			int n = Integer.parseInt(br.readLine());
			
			for (int j = 0; j < n; j++) {
				String[] input = br.readLine().split(" ");
				map.put(input[1], map.getOrDefault(input[1], 0) + 1);
			}

			int answer = 1;
			for (int cnt : map.values()) {
				answer *= (cnt + 1); // 의상 수 + 1, 입지 않는 경우를 포함하기 위해 +1을 해 줘야 함.
			}
			System.out.println(answer - 1);
		}
	}
}