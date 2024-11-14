import java.io.*;
import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder(Integer.toString(n, 3)).reverse();

        
        for (int i = 0; i < sb.length(); i++) {
            int num = sb.charAt(i) - '0';
            
            answer += num * (int) Math.pow(3, sb.length() - i - 1);
            System.out.println(num);
        }
        
        return answer;
    }
}