import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		LocalDate date = LocalDate.now();
		System.out.println(date.getYear());
		System.out.printf("%02d\n", date.getMonthValue());
		System.out.printf("%02d", date.getDayOfMonth());
	}
}
