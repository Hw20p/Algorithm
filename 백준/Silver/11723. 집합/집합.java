import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Set<Integer> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
            if (s.equals("add")) {
                int x = Integer.parseInt(st.nextToken());
                set.add(x);
            } 
            else if (s.equals("remove")) {
                int x = Integer.parseInt(st.nextToken());
                set.remove(x);
            } 
            else if (s.equals("check")) {
                int x = Integer.parseInt(st.nextToken());
                sb.append(set.contains(x) ? "1\n" : "0\n");
            } 
            else if (s.equals("toggle")) {
                int x = Integer.parseInt(st.nextToken());
                if (set.contains(x)) set.remove(x);
                else set.add(x);
            } 
            else if (s.equals("all")) {
                set.clear();
                for (int j = 1; j <= 20; j++) set.add(j);
            } 
            else if (s.equals("empty")) {
                set.clear();
            }
		}
		System.out.println(sb.toString());
	}
}