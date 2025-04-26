import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String uos = "UOS";
		int n = Integer.parseInt(br.readLine()) - 1;
		System.out.println(uos.charAt(n % 3));
	}
}
