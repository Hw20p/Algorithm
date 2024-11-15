import java.util.*;

class Solution {
    public List<Integer> solution(int[] numbers) {
        int n = numbers.length;
        Set<Integer> set = new LinkedHashSet<>();
        
        Arrays.sort(numbers);
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        List<Integer> list = new ArrayList(set);
        Collections.sort(list);
        return list;
    }
}