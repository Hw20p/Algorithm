import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int[] arr = new int[2];
        List<Integer> list = new ArrayList<>();
        for (int i : lottos) {
            if (i == 0) {
                arr[0]++;
            }
            list.add(i);
        }
        
        for (int i : win_nums) {
            if (list.contains(i)) {
                arr[1]++;
            }
        }
        arr[0] += arr[1];
        
        if (arr[0] > 1) {
            answer[0] = 7 - arr[0];
        } else {
            answer[0] = 6;
        }
        
        if (arr[1] > 1) {
            answer[1] = 7 - arr[1];
        } else {
            answer[1] = 6;
        }

        return answer;
    }
}