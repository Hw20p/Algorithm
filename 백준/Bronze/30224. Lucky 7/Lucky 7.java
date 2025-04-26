import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		int numi = Integer.parseInt(num);
		
		if (num.indexOf("7") == -1) {
			if (numi % 7 != 0) System.out.println(0);
			else System.out.println(1);
		} else {
			if (numi % 7 != 0) System.out.println(2);
			else System.out.println(3);
		}
	}
}
