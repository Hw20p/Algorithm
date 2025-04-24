import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(factorial(1, n));
	}
	
	static BigInteger factorial(int left, int right) {
		BigInteger num = BigInteger.valueOf(left);
		
		if (left < right) {
			int mid = (left + right) / 2;
			
			num = factorial(left, mid).multiply(factorial(mid + 1, right));
			// 분할 정복 팩토리얼
			// factorial(8) = f(1,8) = f(1,4) × f(5,8)
		}
		
		return num;
	}
}
