import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = {"Algorithm", "DataAnalysis", "ArtificialIntelligence",
					  "CyberSecurity", "Network", "Startup", "TestStrategy"};
		String[] n = {"204", "207", "302", "B101", "303", "501", "105"};
		
		TreeMap<String, String> map = new TreeMap<>();
		for (int i = 0; i < s.length; i++) {
			map.put(s[i], n[i]);
		}
		
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			System.out.println(map.get(input));
		}
	}
}
