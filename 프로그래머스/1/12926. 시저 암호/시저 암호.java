class Solution {
    public String solution(String s, int n) {
        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String b = "abcdefghijklmnopqrstuvwxyz";
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == ' ') {
                answer += ' ';
                continue;
            }
            
            int idx;
            if (Character.isUpperCase(ch)) {
                idx = (a.indexOf(ch) + n) % 26;
                answer += a.charAt(idx);
            } else {
                idx = (b.indexOf(ch) + n) % 26;
                answer += b.charAt(idx);
            }
        }
        return answer;
    }
}