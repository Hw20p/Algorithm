import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
		if (input >= 620) System.out.println("Red");
		else if (input >= 590) System.out.println("Orange");
		else if (input >= 570) System.out.println("Yellow");
		else if (input >= 495) System.out.println("Green");
		else if (input >= 450) System.out.println("Blue");
		else if (input >= 425) System.out.println("Indigo");
		else System.out.println("Violet");
	}
}
