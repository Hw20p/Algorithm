import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[31];
		for (int i = 0; i < 28; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[num]++;
		}
		
		List<Integer> list = new LinkedList<>();
		for (int i = 1; i <= 30; i++) {
			if (list.size() == 2) break;
			if (arr[i] == 0) list.add(i);
		}
		
		for (int i : list) System.out.println(i);
	}
}