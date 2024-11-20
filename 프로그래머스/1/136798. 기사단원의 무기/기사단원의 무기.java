class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        // 약수의 개수
        for (int i = 1; i <= number; i++) {
            long count = div(i);
            
            // 무기 지급
            if (count > limit) {
                answer += power;
            } else {
                answer += count;
            }
        }
        return answer;
    }
    
    /* 풀이)
	* n이 36일 때, 36의 약수는 다음과 같음:
	* (1 36), (2 18), (3 12), (4 9), (6 6)
	* 이때 (6 6)이 중복이기 때문에 한 번만 더해야 함. 
	*/
    public long div(int num) {
        int count = 0;
        
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
                
                if (i != num / i) {
                    count++;
                }
            }
        }
        return count;
    }
}