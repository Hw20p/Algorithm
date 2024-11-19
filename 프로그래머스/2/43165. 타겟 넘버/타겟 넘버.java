class Solution {
    public int solution(int[] numbers, int target) {
           return dfs(numbers, 0, 0, target);
    }
    
    public int dfs(int[] numbers, int index, int curr, int target) {
        if (index == numbers.length) {
            return curr == target ? 1 : 0;
        }
        
        return dfs(numbers, index + 1, curr + numbers[index], target)
             + dfs(numbers, index + 1, curr - numbers[index], target);
    }
}