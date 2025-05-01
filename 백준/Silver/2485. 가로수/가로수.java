import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 간격 구하기
		int gcd = 0;
		for (int i = 0; i < n - 1; i++) {
			int dist = arr[i + 1] - arr[i];
			gcd = gcd(dist, gcd);
		}
		
		// 필요한 구간 수
		int answer = (arr[n - 1] - arr[0]) / gcd + 1;
		
		// 필요한 구간 수 - 기존 개수
		System.out.println(answer - arr.length);
	}
	
	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b; 
			b = a % b;
			a = temp;
		}
		return a;
	}
}
