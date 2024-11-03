import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
        	String[] arr = br.readLine().split("\\,");
        	int a = Integer.parseInt(arr[0]);
        	int b = Integer.parseInt(arr[1]);
        	System.out.println(a + b);
        }
    }
}