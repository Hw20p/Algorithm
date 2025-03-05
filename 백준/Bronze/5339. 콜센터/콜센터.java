import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] answer = {
				"     /~\\",
				"    ( oo|",
				"    _\\=/_",
				"   /  _  \\",
				"  //|/.\\|\\\\",
				" ||  \\ /  ||",
				"============",
				"|          |",
				"|          |",
				"|          |"
		};
		
		for (String i : answer) 
			System.out.println(i);
	}
}
