import java.io.*;
import java.util.*;

class Solution {
    public String solution(String s) {
        // a = 49, b = 50, A = 17, B = 18 
        String answer = "";
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i) - '0');
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        for (int i : list) {
            answer += (char) (i + 48);
        }
        
        return answer;
    }
}