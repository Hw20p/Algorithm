import java.io.*;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] abc = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int d = Integer.parseInt(br.readLine());
		
		LocalTime time = LocalTime.of(abc[0], abc[1], abc[2]);
		time = time.plusSeconds(d);
		
		System.out.println(time.getHour() + " " + time.getMinute() + " " + time.getSecond());
	}
}
