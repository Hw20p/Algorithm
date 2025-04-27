import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] aa = {11, 9, 9, 9, 8, 8, 8, 8, 8, 8};
		Character[][] bb = {{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'L', 'M'},
							{'A', 'C', 'E', 'F', 'G', 'H', 'I', 'L', 'M'},
							{'A', 'C', 'E', 'F', 'G', 'H', 'I', 'L', 'M'},
							{'A', 'B', 'C', 'E', 'F', 'G', 'H', 'L', 'M'},
							{'A', 'C', 'E', 'F', 'G', 'H', 'L', 'M'},
							{'A', 'C', 'E', 'F', 'G', 'H', 'L', 'M'},
							{'A', 'C', 'E', 'F', 'G', 'H', 'L', 'M'},
							{'A', 'C', 'E', 'F', 'G', 'H', 'L', 'M'},
							{'A', 'C', 'E', 'F', 'G', 'H', 'L', 'M'},
							{'A', 'B', 'C', 'F', 'G', 'H', 'L', 'M'}};
		
		int n = Integer.parseInt(br.readLine());
		System.out.println(aa[--n]);
		
		for (char ch : bb[n]) {
			System.out.print(ch + " ");
		}
	}
}
