import java.io.*;
import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new LinkedList<>();
        
        // 배열의 길이가 1인 경우. 
        if (arr.length == 1) {
            answer.add(-1);
            return answer;
        }
        
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        
        Arrays.sort(arr);
        int n = arr[0];
        
        for (int i : temp) {
            if (i == n) continue;
            answer.add(i);
        }
        
        return answer;
    }
}