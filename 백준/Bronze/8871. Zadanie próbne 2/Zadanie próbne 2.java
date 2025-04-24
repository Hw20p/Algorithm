import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		n++;
		
		// 각 라운드에는 난이도가 다른 2~3개의 과제가 있습니다.
		System.out.println(n * 2 + " " + n * 3);
	}
}
