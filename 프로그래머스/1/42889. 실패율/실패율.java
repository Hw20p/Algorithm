import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int n, int[] stages) { 
        
        // 실패한 스테이지 확인 
        int[] failStages = new int[n + 1];
        for (int i : stages) {
            if (i <= n) {
                failStages[i]++;
            }
        }
        
        // 실패율 계산 
        double[] failP = new double[n];
        int totalPlayers = stages.length;
        for (int i = 0; i < n; i++) {
            if (totalPlayers == 0) {
                failP[i] = 0.0;
            } else {
                failP[i] = (double) failStages[i + 1] / totalPlayers;
                totalPlayers -= failStages[i + 1];
            }
        }
        
        // 실패율과 스테이지 번호 매핑
        TreeMap<Integer, Double> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i + 1, failP[i]);
        }
        
        // 내림차순 정렬 
        List<Map.Entry<Integer, Double>> list = new ArrayList<>(map.entrySet());
        list.sort((e1, e2) -> {
            if (e2.getValue().equals(e1.getValue())) {
               return Integer.compare(e1.getKey(), e2.getKey());
            }
            return Double.compare(e2.getValue(), e1.getValue());
        });
        
        // 정렬된 결과 저장
        int[] answer = new int[n];
        int idx = 0;
        for (Map.Entry<Integer, Double> entry : list) {
            answer[idx++] = entry.getKey();
        }

        return answer;
    }
}