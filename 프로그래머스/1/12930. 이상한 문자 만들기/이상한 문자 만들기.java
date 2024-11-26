import java.io.*;

class Solution {
    public String solution(String s) {
        int len = 0;
        StringBuilder sb = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                len = 0;
                sb.append(ch);
                continue;
            }
            
            if (len % 2 == 0) {
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(Character.toLowerCase(ch));
            }
            len++;
        }
        
        return sb.toString();
    }
}