import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Map<Integer, int[]> map = new HashMap<>();
		int[] a = {0, 12, 11, 11, 10, 9, 9, 9, 8, 7, 6, 6};
		int[] b = {0, 1600, 894, 1327, 1311, 1004, 1178, 1357, 837, 1055, 556, 773};
		
		for (int i = 0; i < a.length; i++) {
			map.put(i, new int[]{a[i], b[i]});
		}
		
		int n = Integer.parseInt(br.readLine());
		for (int i : map.get(n)) {
			System.out.print(i + " ");
		}
	}
}
