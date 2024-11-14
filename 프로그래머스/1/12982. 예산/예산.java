import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0, len = d.length;
        
        Arrays.sort(d);
        
        int sum = 0;
        for (int i : d) {
            sum += i;
            
            if (sum > budget) {
                break;
            } else {
                answer++;
            }
        }
        
        return answer;
    }
}