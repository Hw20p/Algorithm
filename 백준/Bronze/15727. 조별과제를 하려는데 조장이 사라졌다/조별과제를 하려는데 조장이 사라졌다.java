import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		
		System.out.println(l < 6 ? 1 : l % 5 == 0 ? l / 5 : l / 5 + 1);
	}
}
