import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		char a = num.charAt(0);
		char b = num.charAt(1);
		
		System.out.println(a == b ? 1 : 0);
	}
}
