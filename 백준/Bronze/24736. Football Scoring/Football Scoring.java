import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] score = {6, 3, 2, 1, 2}; 
		int[] result = new int[2];
		for (int i = 0; i < 2; i++) {
			String[] input = br.readLine().split(" ");
			
			int sum = 0, j = 0;
			for (String n : input) {
				sum += score[j++] * Integer.parseInt(n);
			}
			result[i] = sum;
		}
		
		for (int i : result) {
			System.out.print(i + " ");
		}
	}
}
