import java.io.*;
import java.util.*;

class Solution {
    public int solution(String s) {
        String temp = "";
        
        Map<String, Integer> map = new LinkedHashMap<>();
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                          "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        for (int i = 0; i < 10; i++) {
            map.put(words[i], i);
        }
        for (int i = 0; i < 10; i++) {
            map.put(words[i + 10], i);
        }
        
        // System.out.println(map);
        String ss = "";
        for (int i = 0; i < s.length(); i++) {
            ss += s.charAt(i);
            
            if (map.get(ss) != null) {
                temp += Integer.toString(map.get(ss));
                ss = "";
            }
        }
        
        int answer = Integer.parseInt(temp);
        return answer;
    }
}