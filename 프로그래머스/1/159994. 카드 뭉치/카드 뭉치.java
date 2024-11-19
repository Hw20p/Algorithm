class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        int i = 0, j = 0;
        for (String s : goal) {
            if (i < cards1.length && cards1[i].equals(s)) i++;
            else if (j < cards2.length && cards2[j].equals(s)) j++;
            else {
                answer = "No";
                break;
            }
        }
        return answer;
    }
}