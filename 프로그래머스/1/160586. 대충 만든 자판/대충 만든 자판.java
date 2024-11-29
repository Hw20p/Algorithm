import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        /* 첫 번째 풀이... 오답 
        int[] answer = new int[targets.length];
        
        int i = 0;
        for (String s : targets) {
            for (char ch : s.toCharArray()) {
                List<Integer> list = new ArrayList<>();
                for (String ss : keymap) {
                    if (ss.indexOf(ch) != -1) {
                        list.add(ss.indexOf(ch) + 1);
                    } 
                }
                if (list.size() > 1) Collections.sort(list);
                if (list.size() > 0) answer[i] += list.get(0);
            }
            if (answer[i] == 0) answer[i] = -1;
            i++;
        }
        */
        
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();
        for (String key : keymap) {
            for (int i = 1; i <= key.length(); i++) {
                char ch = key.charAt(i - 1);
                if (map.get(ch) != null) {
                    map.put(ch, Math.min(map.get(ch), i));
                } else {
                    map.put(ch, i);
                }
            }
        }
        
        int idx = 0;
        for (String target : targets) {
            for (char t : target.toCharArray()) {
                if (map.get(t) != null) {
                    answer[idx] += map.get(t);
                } else {
                    answer[idx] = -1;
                    break;
                }
            }
            System.out.println(answer[idx]);
            idx++;
        }
        
        return answer;
    }
}