import java.util.*;

public class Solution {
    public int solution(int n) {
        String s = Integer.toString(n);
		int[] arr = new int[s.length()];
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i) - '0';
			sum += arr[i];
		}

        return sum;
    }
}