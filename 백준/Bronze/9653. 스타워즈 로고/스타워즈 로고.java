import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = {"    8888888888  888    88888",
					  "   88     88   88 88   88  88",
					  "    8888  88  88   88  88888",
					  "       88 88 888888888 88   88",
					  "88888888  88 88     88 88    888888",
					  "",
					  "88  88  88   888    88888    888888",
					  "88  88  88  88 88   88  88  88",
					  "88 8888 88 88   88  88888    8888",
					  " 888  888 888888888 88  88      88",
					  "  88  88  88     88 88   88888888"};
		
		for (String ss : s) {
			System.out.println(ss);
		}
	}
}