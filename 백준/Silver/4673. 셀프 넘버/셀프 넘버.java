import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean[] selfNum = new boolean[10001]; // 1 ~ 10000
		
		for (int i = 1; i <= 10000; i++) {
			int n = f(i);
			if (n <= 10000) {
				selfNum[n] = true;
			}
		}
		
		// 생성자가 없는 숫자를 셀프 넘버라고 한다.
		for (int i = 1; i <= 10000; i++) {
			if (!selfNum[i]) System.out.println(i);
		}
	}
	
	public static int f(int n) {
		int sum = n;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}
