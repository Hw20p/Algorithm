import java.io.*;
import java.util.*;

class Solution {
    public int solution(String s) {
        int n = s.length();
        
        char ch = s.charAt(0);
        int x = 0, y = 0;
        
        String arr = "";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (x == 0 && y == 0) {
                ch = s.charAt(i);
            }
            
            if (ch == s.charAt(i)) {
                x++;
            } else {
                y++;
            }
            
            arr += s.charAt(i);
            if (x == y) {
                list.add(arr);
                x = 0;
                y = 0;
                arr = "";
            }
        }
        
        if (arr.length() > 0) {
            list.add(arr);
        }
        System.out.println(list);
        
        return list.size();
    }
}