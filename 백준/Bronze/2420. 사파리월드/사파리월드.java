import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		BigInteger n = new BigInteger(input[0]);
		BigInteger m = new BigInteger(input[1]);
		
		if (n.compareTo(m) > 0) {
			System.out.println(n.subtract(m));
		} else {
			System.out.println(m.subtract(n));
		}
	}
}
