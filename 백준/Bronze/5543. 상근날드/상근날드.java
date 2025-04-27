import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] aa = new int[3];
		int[] bb = new int[2];
		
		for (int i = 0; i < 5; i++) {
			if (i > 2) {
				bb[i % 3] = Integer.parseInt(br.readLine());
			} else {
				aa[i] = Integer.parseInt(br.readLine());
			}
		}
		
		Arrays.sort(aa);
		Arrays.sort(bb);
		
		System.out.println(aa[0] + bb[0] - 50);
	}
}
