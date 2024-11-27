import java.io.*;
import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        Set<Character> set = new HashSet<>();
        for (char ch : skip.toCharArray()) {
            set.add(ch);
        }
        
        for (char ch : s.toCharArray()) {
            char curr = ch;
            int step = 0;
            
            while (step < index) {
                curr++;
                if (curr > 'z') {
                    curr = 'a';
                } 
                if (!set.contains(curr)) {
                    step++;
                }
            }
            answer += curr;
        }
        return answer;
    }
}