import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int r = Integer.parseInt(br.readLine());
		int s = Integer.parseInt(br.readLine());
		int answer = (r * 8 + s * 3) - 28;
		
		System.out.println(answer < 1 ? 0 : answer);
		
	}
}
