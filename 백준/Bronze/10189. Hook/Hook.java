import java.io.*;
import java.util.*;

public class Main {	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        String[] s = {"#  # #### #### #  #",
        			  "#### #  # #  # # #",
        		      "#### #  # #  # # #",
        			  "#  # #### #### #  #"};
        
        for (String i : s) {
        	System.out.println(i);
        }
    }
}
