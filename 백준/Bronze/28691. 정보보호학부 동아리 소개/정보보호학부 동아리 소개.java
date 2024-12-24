import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           
        HashMap<String, String> map = new HashMap<>();
        String[] s = {"MatKor", "WiCys", "CyKor", "AlKor", "$clear"};
        String[] c = {"M", "W", "C", "A", "$"};
        
        for (int i = 0; i < 5; i++) {
        	map.put(c[i], s[i]);
        }
        
        System.out.println(map.get(br.readLine()));
    }
}
