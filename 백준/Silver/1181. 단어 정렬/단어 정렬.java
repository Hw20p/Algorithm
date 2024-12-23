import java.io.*;
import java.util.*;


public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}

		Arrays.sort(arr, (a, b) -> {
			if (a.length() != b.length()) return Integer.compare(a.length(), b.length());
			else return a.compareTo(b);
		});
		
		LinkedHashSet<String> list = new LinkedHashSet<>();
		for (String s : arr) {
			list.add(s);
		}
		
		for (String s : list) {
			System.out.println(s);
		}	
	}
}