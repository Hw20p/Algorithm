import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] max = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] mel = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] t = {3, 20, 120};
		int maxSum = 0, melSum = 0;
		
		for (int i = 0; i < 3; i++) {
			max[i] *= t[i]; 
			mel[i] *= t[i];
			maxSum += max[i];
			melSum += mel[i];
		}
		
		if (maxSum > melSum) System.out.println("Max");
		else if (maxSum < melSum) System.out.println("Mel");
		else System.out.println("Draw");
	}
}
