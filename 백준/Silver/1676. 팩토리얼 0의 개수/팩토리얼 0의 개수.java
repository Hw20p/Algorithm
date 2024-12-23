import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		
		BigInteger sum = BigInteger.ONE;
		for (long i=1; i<=n; i++) {
			sum = sum.multiply(BigInteger.valueOf(i));
		}
		
		String tmp = sum.toString();
		long cnt = 0;
		for (int j=0; j<tmp.length(); j++) {
			if (tmp.charAt(tmp.length()-j-1) == '0') {
				cnt++;
			} else {
				break;
			}
		}
		System.out.println(cnt);
	}
}