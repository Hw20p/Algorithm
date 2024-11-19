import java.io.*;
import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] s : clothes) {
            map.put(s[1], map.getOrDefault(s[1], 0) + 1);
        }
        System.out.println(map);
        
        answer = 1;
        for (var i : map.entrySet()) {
            answer *= i.getValue() + 1;
        }
        
        return answer - 1;
    }
}