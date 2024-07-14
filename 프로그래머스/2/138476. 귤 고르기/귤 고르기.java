import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int[] tangerine) {
        //귤 크기에 따른 개수 저장 : HashMap
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for (int i=0; i<tangerine.length; i++){
            int x = 1;      // 빈도수 카운트 시작 = 1 (무조건 하나는 있으니까)
            if(h.containsKey(tangerine[i])){
                x = h.get(tangerine[i]) + 1;
            }
            h.put(tangerine[i], x);
        }
            
        //value 값 기준으로 내림차순 정렬
        HashMap<Integer, Integer> h_sorted = h.entrySet()
                                              .stream()
                                              .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                                              .collect(Collectors.toMap(
                                                  Map.Entry::getKey,
                                                  Map.Entry::getValue,
                                                  (e1, e2) -> e1,
                                                  LinkedHashMap::new
                                              ));

        
        //k에서 value 값을 빼면서 0이 되면 탈출
        int answer = 0;                        //key의 고유한 개수
        for (int key : h_sorted.keySet()){     //key 값
            int value = h_sorted.get(key);     //value 값
            k -= value;
            answer += 1;
            if(k <= 0){
                break;
            }
        }
        return answer;
    }
}