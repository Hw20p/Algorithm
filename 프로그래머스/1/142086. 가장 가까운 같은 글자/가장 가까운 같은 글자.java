import java.io.*;
import java.util.*;

class Solution {
    public List<Integer> solution(String s) {
        int n = s.length();
        
        List<Integer> answer = new LinkedList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            
            if (map.get(ch) == null) {
                answer.add(-1);
                map.put(ch, i);
            } else {
                int idx = i - map.get(ch);
                answer.add(idx);
                map.put(ch, i);
            }
        }
        
        return answer;
    }
}