import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int V = n / 5;
		int I = n % 5;
		
		System.out.println("V".repeat(V) + "" + "I".repeat(I));
	}
}
