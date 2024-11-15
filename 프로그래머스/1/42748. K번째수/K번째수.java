import java.util.*;

class Solution {
    public List<Integer> solution(int[] array, int[][] commands) {
        List<Integer> answer = new LinkedList<>();
            
        for (int[] i : commands) {
            int x = i[0], y = i[1], idx = i[2];
            int n = y - x + 1;
            
            int[] arr = new int[n];
            int m = 0;
            for (int j = x - 1; j < y; j++) {
                arr[m++] = array[j];
            }
            Arrays.sort(arr);
            answer.add(arr[idx - 1]);
        }
        return answer;
    }
}