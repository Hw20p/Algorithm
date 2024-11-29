import java.io.*;
import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int[] countX = new int[10];
        int[] countY = new int[10];
        
        for (char ch : X.toCharArray()) {
            countX[ch - '0']++;
        }
        for (char ch : Y.toCharArray()) {
            countY[ch - '0']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            int shit = Math.min(countX[i], countY[i]);
            for (int j = 0; j < shit; j++) {
                sb.append(i);
            }
        }
        
        if (sb.length() < 1) return "-1";
        if (sb.charAt(0) == '0') return "0";
        
        return sb.toString();
    }
}