import java.util.*;
import java.io.*;

public class Main {
	public static int f(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		
		return f(n - 1) + f(n - 2);
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        System.out.println(f(n));
    }
}
