import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] one = s.split("0+");
		String[] zero = s.split("1+");
		
		int oneSize = 0, zeroSize = 0;
		if (one.length == 0 || zero.length == 0) {
			zeroSize = zero.length;
			oneSize = one.length;
		} else if (s.charAt(0) == '1') {
			zeroSize = zero.length - 1;
			oneSize = one.length;
		} else {
			zeroSize = zero.length;
			oneSize = one.length - 1;
		}	
		System.out.println(Math.min(oneSize, zeroSize));
	}
}