class Solution {
    public int[] solution(long n) {
        String numSplit = Long.toString(n);
		int len = numSplit.length();
		int[] answer = new int[len];
		
		for (int i = 0; i < len; i++) {
			answer[len - i - 1] = numSplit.charAt(i) -'0';
		}
		return answer;
    }
}