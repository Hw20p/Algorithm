class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        
        if (len % 2 == 0) {
            int i = len / 2 - 1;
            answer += s.charAt(i);
            answer += s.charAt(i + 1);
        } else {
            answer += s.charAt(len / 2);
        }
        
        
        return answer;
    }
}