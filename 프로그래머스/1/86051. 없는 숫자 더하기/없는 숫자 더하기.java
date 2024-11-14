import java.io.*;

class Solution {
    public int solution(int[] numbers) {
        int n = numbers.length;
        int[] arr = new int[10];
        
        for (int i = 0; i < n; i++) {
            arr[numbers[i]] = 1;
        }
        
        int answer = 0;
        for (int i = 0; i< 10; i++) {
            if (arr[i] == 0) {
                answer += i;
            }
        }
        
        return answer;
    }
}