import java.io.*;
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        for (String i : participant) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for (String i : completion) {
            map.put(i, map.get(i) - 1);
        }
        
        for (var i : map.entrySet()) {
            if (i.getValue() != 0) { 
                answer = i.getKey(); 
            }
        }
        return answer;
    }
}