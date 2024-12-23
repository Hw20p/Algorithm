import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[][] arr = new String[n][2];
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		// 정렬: 나이를 숫자로 변환해서 비교, 나이가 같으면 이름을 가입한 순으로 정렬
		Arrays.sort(arr, (a, b) -> {
			int ageA = Integer.parseInt(a[0]);
			int ageB = Integer.parseInt(b[0]);
			
			if (ageA != ageB) {
				return Integer.compare(ageA, ageB); // 나이를 기준으로 정렬
			} else  {
				return 0;	// 나이가 같으면 가입한 순으로 정렬 
			}
		});
		
		for (int i=0; i<n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}
