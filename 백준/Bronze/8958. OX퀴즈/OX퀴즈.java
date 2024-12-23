import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		for (int i=0; i<n; i++) {
			String s = br.readLine();
			
			int sum = 1;
			int total = 0;
			for (int j=0; j<s.length()-1; j++) {
				if (s.charAt(j) == 'O') {
					total += sum;
					
					if (s.charAt(j+1) == 'O') {
						sum++;
					} else {
						sum = 1;
					}
					
				}
			}
			if (s.charAt(s.length()-1) == 'O') 
				total += sum;
			
			System.out.println(total);
		}
	}
    
    public static void main(String args[]) throws IOException {
		new Main().solution();
	}
}