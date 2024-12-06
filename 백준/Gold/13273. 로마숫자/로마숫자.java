import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 로마 숫자 매핑
		HashMap<String, Integer> map = new LinkedHashMap<>();
		String[] sign = {"IV", "IX", "XL", "XC", "CD", "CM", "I", "V", "X", "L", "C", "D", "M"};
		int[] value = {4, 9, 40, 90, 400, 900, 1, 5, 10, 50, 100, 500, 1000};
		for (int i = 0; i < sign.length; i++) {
			map.put(sign[i], value[i]);
		}
		
		int n = Integer.parseInt(br.readLine());
		for (int ii = 0; ii < n; ii++) {
			String ss = br.readLine();
			
			// 숫자인 경우
			if (ss.matches("\\d+")) {
				// 로마 숫자 매핑 (숫자 내림차순)
				int answer = Integer.parseInt(ss);
				HashMap<Integer, String> map2 = new LinkedHashMap<>();
				String[] sign2 = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
				int[] value2 = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
				for (int i = 0; i < sign2.length; i++) {
					map2.put(value2[i], sign2[i]);
				}

				String answer2 = "";
				while (answer != 0) {
					for (int i : value2) {
						if (answer >= i) {
							for (int j = 0; j < answer / i; j++) {
								answer2 += map2.get(i);
							}
							answer %= i;
						}
					}
				}
				System.out.println(answer2);
			}
			
			
			// 문자인 경우
			else {
				int sum = 0;
				while (ss.length() != 0) {
					for (String s : sign) {
						if (ss.startsWith(s)) {
							ss = ss.substring(s.length());
							sum += map.get(s);
							break;
						}
					}
				}
				System.out.println(sum);
			}
		}
	}
}