import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       	int n = Integer.parseInt(br.readLine());
       	String[] s = new String[n];
       	
       	for (int i = 0; i < n; i++) {
       		s[i] = br.readLine();
       	}
       	
        for (String i : s) {
        	if (i.contains("S")) {
        		System.out.println(i);
        		break;
        	}
        }
    }
}