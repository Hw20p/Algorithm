import java.io.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            char word = s.charAt(i);
            
            if (word == ' ') {
                sb.append(" ");
                idx = 0;
            } else {
                if (idx % 2 == 0) {
                    sb.append(Character.toUpperCase(word));
                    idx++;
                } else {
                    sb.append(Character.toLowerCase(word));
                    idx++;
                }
            } 
        }
        return sb.toString();
    }
}