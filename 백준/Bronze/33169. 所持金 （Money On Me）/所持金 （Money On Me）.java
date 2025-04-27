import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine()) * 1_000;
		int v = Integer.parseInt(br.readLine()) * 10_000;
		System.out.println(t + v);
	}
}
