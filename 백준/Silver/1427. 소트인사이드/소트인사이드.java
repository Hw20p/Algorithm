import java.io.*;
import java.util.*;


public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		List<Integer> list = new ArrayList<>();
		
		for (char ch : s.toCharArray()) {
			list.add(ch - '0');
		}
		
		Collections.sort(list, Collections.reverseOrder());
		for (int i : list) System.out.print(i);
	}
}