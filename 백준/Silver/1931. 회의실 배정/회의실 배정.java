import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] room = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			room[i][0] = Integer.parseInt(input[0]); // 시작 시간
			room[i][1] = Integer.parseInt(input[1]); // 종료 시간
		}
		
		Arrays.sort(room, (a, b) -> {
			// 종료 시간이 같을 경우, 시작 시간을 기준으로 정렬
			if (a[1] == b[1]) return Integer.compare(a[0], b[0]);
			
			// 종료 시간이 같지 않을 경우, 종료 시간을 기준으로 정렬
			else return Integer.compare(a[1], b[1]);
		});
		
		int curr = 0, count = 0;
		for (int i = 0; i < n; i++) {
			// 현재 회의가 끝난 시점 이후에 시작할 수 있는 회의인지 확인
			if (curr <= room[i][0]) {
				count++;
				// 현재 회의의 종료 시간을 업데이트
				curr = room[i][1];
			}
		}
		System.out.println(count);
	}
}