import java.io.*;
import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        
        int j = 0;
        for (int i = 1; i < food.length; i++) {
            map.put(i, food[i]);
            j++;
        }
        
        for (var i : map.entrySet()) {
            map.put(i.getKey(), i.getValue() / 2);
        }
        
        // System.out.println(map);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            for (int ii = 0; ii < map.get(i); ii++) {
                sb.append(i);
            }
        }
        
        answer += sb.toString();
        answer += 0;
        answer += sb.reverse().toString();
        return answer;
    }
}