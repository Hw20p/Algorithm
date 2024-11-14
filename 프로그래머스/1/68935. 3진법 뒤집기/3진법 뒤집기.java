import java.io.*;
import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder(Integer.toString(n, 3)).reverse();
        answer = Integer.parseInt(sb.toString(), 3);
        
        return answer;
    }
}