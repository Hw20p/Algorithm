import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        
        long aa = a, bb = b;
        
        while (b != 0) {
        	long temp = b;
        	b = a % b;
        	a = temp;
        }
        
        System.out.println(aa / a * bb);
    }
}
