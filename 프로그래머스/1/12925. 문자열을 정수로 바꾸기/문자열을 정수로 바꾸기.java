class Solution {
    public int solution(String s) {
        int res = 0;
		if (s.charAt(0) == '-') {
			res = Integer.parseInt(s.substring(1));
			return -res;
		}
		res = Integer.parseInt(s);
		return res;
    }
}