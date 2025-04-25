import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int i = 0;
		while (i++ < n) {
			int num = Integer.parseInt(br.readLine());
			System.out.println(num + " " + num);
		}
	}
}
