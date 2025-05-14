import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] n = new int[5];
		int sum = 0;
		for (int i=0; i<5; i++) {
			n[i] = Integer.parseInt(st.nextToken());
			sum += n[i]*n[i];
		}
		
		System.out.print(sum%10);
	}
    public static void main(String[] args) throws IOException {
		new Main().solution();
	}
}

    