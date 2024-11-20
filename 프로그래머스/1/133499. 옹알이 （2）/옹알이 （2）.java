class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] babb = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            String temp = babbling[i];
            
            for (int j = 0; j < babb.length; j++) {
                temp = temp.replace(babb[j], Integer.toString(j));
            }
            
            // 숫자 변환 후, 연속된 발음을 확인
            if (temp.contains("00") || temp.contains("11") || 
                temp.contains("22") || temp.contains("33")) {
                continue;
            }
            
            boolean check = true;
            for (char ch : temp.toCharArray()) {
                if (ch < '0' || ch > '3') {
                    check = false;
                    break;
                }
            }
            
            if (check) answer++;
        }
        return answer;
    }
}