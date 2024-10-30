import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	static BigInteger sum = BigInteger.ONE;
	
	public static BigInteger f(int n) {
		if (n == 0) return sum;
		sum = sum.multiply(BigInteger.valueOf(n));
		return f(n - 1);
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        System.out.println(f(n));
    }
}
