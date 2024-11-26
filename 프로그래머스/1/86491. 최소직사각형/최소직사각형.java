import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int w = 0, h = 0, mw = 0, mh = 0;
        
        for (int[] size : sizes) {
            mw = Math.max(size[0], size[1]);
            mh = Math.min(size[0], size[1]);
            
            w = Math.max(w, mw);
            h = Math.max(h, mh);
        }
        
        return w * h;
    }
}