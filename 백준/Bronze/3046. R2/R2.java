import java.io.*;
import java.util.*;

public class Main {
	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int r1 = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int r2 = s * 2 - r1;
		
		System.out.println(r2);
		
	}
}