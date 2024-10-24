import java.io.*;
import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int min = k + 1;
        
        if (score.length < m) {
            return 0;
        }
        
        for (int i = 0; i < score.length; i++) {
            if (score[score.length - 1 - i] <= min) {
                min = score[score.length - 1 - i];
            }
            
            if ((i+1) % m == 0) {
                answer += min * m;
                min = k + 1;
            }
        }
        
        return answer;
    }
}