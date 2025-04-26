import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			BigInteger n = new BigInteger(br.readLine());
			if (n.compareTo(BigInteger.ZERO) == 0) break;
			
			System.out.println(n.mod(BigInteger.valueOf(42)) != BigInteger.ZERO ? "TENTE NOVAMENTE" : "PREMIADO");
		}
	}
}
