class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        String[] nums = dartResult.replaceAll("[^0-9]+", " ").trim().split("\\s+");
        String[] bonus = dartResult.replaceAll("[0-9]+", " ").trim().split("\\s+");
        int n = nums.length;
        
        // 1 2 3 
        // S D* T 
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            char a = bonus[i].charAt(0);
            char b = ' ';
            if (bonus[i].length() > 1) b = bonus[i].charAt(1);
            
            if (a == 'S') {
                arr[i] = (int) Math.pow(Integer.parseInt(nums[i]), 1);
            } else if (a == 'D') {
                arr[i] = (int) Math.pow(Integer.parseInt(nums[i]), 2);
            } else if (a == 'T') {
                arr[i] = (int) Math.pow(Integer.parseInt(nums[i]), 3);
            }
            
            if (b == '*') {
                if (i > 0) {
                    arr[i - 1] *= 2;
                }
                arr[i] *= 2;
            } 
            if (b == '#') {
                arr[i] *= -1;
            }
        }

        for (int i : arr) {
            answer += i;
        }

        return answer;
    }
}