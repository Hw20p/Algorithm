import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        int n = Integer.parseInt(br.readLine());
        
        int count = 0;
        for (int i = 0; i < n; i++) {
        	String ss = br.readLine();
        	if (ss.equals(s)) {
        		count++;
        	}
        }
        System.out.println(count);
    }
}