import java.io.*;
import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        int i = (int) Math.sqrt(n);
        if ((long) Math.pow((long) Math.sqrt(n), 2) == n) {
            return (long) Math.pow((long) Math.sqrt(n) + 1, 2);
        }
        
        
        return -1;
    }
}