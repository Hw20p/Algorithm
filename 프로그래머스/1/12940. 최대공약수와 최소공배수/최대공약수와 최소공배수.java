class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int p = n * m;
        
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        
        // 최대공약수
        answer[0] = n;
        
        // 최소공배수
        answer[1] = p / n;
        
        return answer;
    }
}