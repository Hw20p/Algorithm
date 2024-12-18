import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		String[] input = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
		Set<Integer> set = new HashSet<>();
		for (int i : arr) set.add(i);
		
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < list.size(); i++) map.put(list.get(i), i);
		
		// 결과 출력
		StringBuilder sb = new StringBuilder();
		for (int i : arr) sb.append(map.get(i)).append(" ");
		System.out.println(sb.toString().trim());
	}
}