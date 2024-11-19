import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        
        System.out.println(set);
        int n = nums.length / 2;
        
        if (set.size() <= n) {
            answer = set.size();
        } else {
            answer = n;
        }
        
        return answer;
    }
}