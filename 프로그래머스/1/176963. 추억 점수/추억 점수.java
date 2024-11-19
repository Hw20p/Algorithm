import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int n = name.length;
        
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(name[i], yearning[i]);
        }
        
        int idx = 0;
        for (String[] s : photo) {
            int sum = 0;
            for (String ss : s) {
                if (map.get(ss) != null) {
                    sum += map.get(ss);
                }
            }
            answer[idx++] = sum;
        }
        return answer;
    }
}