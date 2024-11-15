class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String format = "%" + n + "s";
        
        for (int i = 0; i < n; i++) {
            String arr11 = String.format(format, Integer.toBinaryString(arr1[i]));
            String arr22 = String.format(format, Integer.toBinaryString(arr2[i]));
            StringBuilder sb = new StringBuilder();
            
            for (int j = 0; j < n; j++) {
                if (arr11.charAt(j) == '1' || arr22.charAt(j) == '1') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}