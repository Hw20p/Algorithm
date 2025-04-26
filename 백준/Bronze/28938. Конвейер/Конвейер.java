import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int answer = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).sum();
		
		if (answer > 0) System.out.println("Right");
		else if (answer < 0) System.out.println("Left");
		else System.out.println("Stay");
	}
}
