import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int cnt = 0;
		
		while ((s = br.readLine()) != null) {
			cnt++;
		}
		System.out.println(cnt);
	}
}
