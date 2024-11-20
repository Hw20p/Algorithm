import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        Arrays.sort(wallet);
        Arrays.sort(bill);
        int a = bill[0];
        int b = bill[1];

        while (true) {
            if (a <= wallet[0] && b <= wallet[1]) break;
            
            b /= 2;
            answer++;
            
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
        }
        return answer;
    }
}