import java.io.*;
import java.util.*;


public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		List<int[]> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			list.add(new int[] {x, y});
		}
		
		list.sort((a, b) -> {
			if (a[0] == b[0]) return Integer.compare(a[1], b[1]);
			return Integer.compare(a[0], b[0]);
		});
		
		for (int[] i : list) {
			System.out.println(i[0] + " " + i[1]);
		}
	}
}