import java.io.*;
import java.util.*;

class Solution {
    public long solution(long n) {
        String s = Long.toString(n);
		List<Integer> list = new LinkedList<Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			list.add(s.charAt(i) - '0');
		}
		Collections.sort(list);

		
		long answer = 0;
		for (int i = 0; i < list.size(); i++) {
			answer += list.get(i) * Math.pow(10, i);
		}
		return answer;
    }
}