class Solution {
    
    public int solution(int n) {
        
        
        int num=0;
        
        for(int i =1; i<=n; i++){
            
            if(n%i==1){
                num=i;
                break;
            }
        }
        
        return num;
    }
}