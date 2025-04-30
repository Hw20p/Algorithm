import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[101][101];
		
		for (int i = 0; i < 4; i ++) {
			int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int x1 = input[0];
			int y1 = input[1];
			int x2 = input[2];
			int y2 = input[3];
			
			for (int ii = x1; ii < x2; ii++) {
				for (int jj = y1; jj < y2; jj++) {
					arr[ii][jj] = 1;
				}
			}
		}
		
		int answer = 0;
		for (int[] i : arr) {
			for (int j : i) {
				answer += j;
			}
		}
		System.out.println(answer);
	}
}
