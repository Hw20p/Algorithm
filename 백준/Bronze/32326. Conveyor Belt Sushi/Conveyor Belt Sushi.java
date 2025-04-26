import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int r = Integer.parseInt(br.readLine()) * 3;
		int g = Integer.parseInt(br.readLine()) * 4;
		int b = Integer.parseInt(br.readLine()) * 5;
		
		System.out.println(r + g + b);
	}
}
