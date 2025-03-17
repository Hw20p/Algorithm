import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BigInteger total = new BigInteger(br.readLine());
		BigInteger klaudia = new BigInteger(br.readLine());
		BigInteger natalia = total.subtract(klaudia).divide(BigInteger.TWO);
		
		System.out.println(klaudia.add(natalia));
		System.out.println(natalia);
	}
}
