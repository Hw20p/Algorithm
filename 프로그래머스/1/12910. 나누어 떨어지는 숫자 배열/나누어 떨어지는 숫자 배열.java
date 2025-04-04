import java.io.*;
import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        int j = 0;
        for (int i : arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }
        
        if (list.size() == 0) {
            list.add(-1);
            return list;
        }
        
        Collections.sort(list);
        System.out.print(list);
        return list;
    }
}