import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashMap<String, String> map = new HashMap<>();
        String[] s1 = {"North London Collegiate School", 
        			   "Branksome Hall Asia",
        			   "Korea International School",
        			   "St. Johnsbury Academy"};
        String[] s2 = {"NLCS", "BHA", "KIS", "SJA"};
        
        for (int i = 0; i < 4; i++) {
        	map.put(s2[i], s1[i]);
        }
        
        System.out.println(map.get(br.readLine()));
    }
}