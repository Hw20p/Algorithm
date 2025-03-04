import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
	static void eratos(int m, int n) {
		boolean[] isPrime = new boolean[n+1];
		
		for (int i=0; i<isPrime.length; i++) {
			isPrime[i] = true;
		}
		isPrime[0] = false;
		isPrime[1] = false;
		
		for (int i=2; i*i<=n; i++) { // 2부터 √n까지 반복
			if (isPrime[i]) {
				for (int j=i*i; j<=n; j+=i) { // i의 배수를 모두 소수가 아니라고 표시
					isPrime[j] = false;
				}
			}
		}
		
		for (int i=m; i<=n; i++) {
			if (isPrime[i]) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		eratos(m, n);
	}
}

