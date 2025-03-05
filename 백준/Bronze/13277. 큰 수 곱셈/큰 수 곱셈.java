import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		BigInteger a = new BigInteger(input[0]);
		BigInteger b = new BigInteger(input[1]);
		
		System.out.println(a.multiply(b));
	}
}
