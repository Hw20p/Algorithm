import java.io.*;
import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, 1);
        }
        
        for (int i : lost) {
            map.put(i, map.get(i) - 1);
        }
        
        for (int i : reserve) {
            map.put(i, map.get(i) + 1);
        }
        
        System.out.println(map);
        for (int i = 1; i <= n; i++) {
            if (map.get(i) == 0) {
                if (map.get(i - 1) != null && map.get(i - 1) > 1) {
                    map.put(i - 1, map.get(i - 1) - 1);
                    map.put(i, map.get(i) + 1);
                } else if (map.get(i + 1) != null && map.get(i + 1) > 1) {
                    map.put(i + 1, map.get(i + 1) - 1);
                    map.put(i, map.get(i) + 1);
                }
            }
        }
        
        for (var i : map.entrySet()) {
            if (i.getValue() > 0) answer++;
        }
        
        return answer;
    }
}