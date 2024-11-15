class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] arr11 = new String[n];
        String[] arr22 = new String[n];
        String format = "%0" + n + "d";
        int idx = 0;
        
        for (int i : arr1) {
            arr11[idx++] = String.format(format, Integer.parseInt(Integer.toString(i, 2)));
        }
        
        idx = 0;
        for (int i : arr2) {
            arr22[idx++] = String.format(format, Integer.parseInt(Integer.toString(i, 2)));
        }
        
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                int num11 = arr11[i].charAt(j) - '0';
                int num22 = arr22[i].charAt(j) - '0';
                
                if (num11 == 1 || num22 == 1) {
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