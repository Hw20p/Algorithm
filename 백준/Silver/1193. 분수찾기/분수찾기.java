import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int d = 1;
		
		// d번 라인, n번에 위치
		while (n > d) {
			n -= d;
			d += 1;
		}
		
		int x = 0, y = 0;
		if (d % 2 == 0) {
			x = n;
			y = d - n + 1;
		} else {
			x = d - n + 1;
			y = n;
		}
		
		System.out.println(x + "/" + y);
	}
}
