import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		LocalDate date = LocalDate.of(2024, 8, 1);
		int n = Integer.parseInt(br.readLine());
		n = (n - 1) * 7;
		
		date = date.plusMonths(n);
		System.out.println(date.getYear() + " " + date.getMonthValue());
	}
}
