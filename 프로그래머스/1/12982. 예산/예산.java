import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0, sum = 0;
        Arrays.sort(d);
        
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