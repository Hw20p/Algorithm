import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = {
				" @@@   @@@",
				"@   @ @   @",
				"@    @    @",
				"@         @",
				" @       @ ",
				"  @     @  ",
				"   @   @   ",
				"    @ @    ",
				"     @     "
		};
				
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			for (String j : s) {
				System.out.println(j);
			}
		}
	}
}
