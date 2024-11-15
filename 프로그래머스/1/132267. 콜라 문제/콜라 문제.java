class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        // 콜라를 받기 위해 마트에 주어야 하는 병 수 a, 
        // 빈 병 a개를 가져다 주면 마트가 주는 콜라 병 수 b, 
        // 상빈이가 가지고 있는 빈 병의 개수 n
        
        int m = 0, k = 0;
        while (true) {
            m = n / a * b;
            answer += m;
            m += n % a;
            
            if (m < a) break;
            n = m;
        }
        
        return answer;
    }
}