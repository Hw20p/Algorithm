import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int h1 = Integer.parseInt(br.readLine());
		int h2 = Integer.parseInt(br.readLine());
		
		if (h1 > 3) {
			h1 = 24 - h1;
			System.out.println(h1 + h2);
		} else {
			System.out.println(h2 - h1);
		}
	}
}
