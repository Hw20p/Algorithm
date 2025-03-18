import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[3];
		arr[0] = Integer.parseInt(br.readLine());
		arr[1] = Integer.parseInt(br.readLine());
		arr[2] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		System.out.println(arr[1]);
	}
}
