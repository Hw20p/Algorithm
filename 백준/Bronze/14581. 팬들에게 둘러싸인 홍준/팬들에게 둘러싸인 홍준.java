import java.io.*;
import java.util.*;

public class Main {	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        System.out.println(":fan:".repeat(3));
        System.out.println(":fan::" + s + "::fan:");
        System.out.println(":fan:".repeat(3));
    }
}
