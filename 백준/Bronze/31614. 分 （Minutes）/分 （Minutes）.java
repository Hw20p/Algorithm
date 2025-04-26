import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int h = Integer.parseInt(br.readLine()) * 60;
		int m = Integer.parseInt(br.readLine());
		
		System.out.println(h + m);
	}
}
