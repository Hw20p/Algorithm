import java.io.*;
import java.util.*;

public class Main {	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        String s = br.readLine();
        if (s.equals("n") || s.equals("N")) {
        	System.out.println("Naver D2");
        } else {
        	System.out.println("Naver Whale");
        }
    }
}
