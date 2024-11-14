class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        if (s.length() == 4 || s.length() == 6) {
            answer = true;
        }
        
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - '0';
            if (a > 9) answer = false;
        }
        
        
        return answer;
    }
}