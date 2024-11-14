import java.io.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long lP = Long.parseLong(p);
        
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String s = t.substring(i, i + p.length());
            long num = Long.parseLong(s);
            
            if (num <= lP) {
                answer++;
            }
        }
        
        return answer;
    }
}