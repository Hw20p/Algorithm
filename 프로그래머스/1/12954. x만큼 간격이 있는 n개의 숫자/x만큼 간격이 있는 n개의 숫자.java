
class Solution {
    
    public long[] solution(int x, int n) {
    
        long sum = 0;
        
        long[] answer = new long[n];
        for(int i=0; i<n; i++){
            
            sum+= x;
            answer[i] = sum;
            System.out.println(sum);
        }
            
        return answer;
    
    }
}