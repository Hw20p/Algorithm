import java.io.*;
import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        int n = answers.length;
        List<Integer> answer = new LinkedList<>();
        
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int aa = 0;
        int bb = 0;
        int cc = 0;
        
        for (int i = 0; i < n; i++) {
            if (a[i % a.length] == answers[i]) aa++;
            if (b[i % b.length] == answers[i]) bb++;
            if (c[i % c.length] == answers[i]) cc++;
        }
        
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        map.put(1, aa);
        map.put(2, bb);
        map.put(3, cc);
        
        int max = 0;
        for (var i : map.entrySet()) {
            if(i.getValue() > max) max = i.getValue();
        }
        
        for (var i : map.entrySet()) {
            if (i.getValue() == max) answer.add(i.getKey());
        }
        
        return answer;
    }
}