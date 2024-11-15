import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        int count = 0;
        for (char i : s.toCharArray()) {
        	if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
        		count++;
        	}
        }
        System.out.println(count);
        
    }
}