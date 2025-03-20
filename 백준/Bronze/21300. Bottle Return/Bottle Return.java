import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).sum() * 5);
	}
}
