import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int[] tangerine) {
        //귤 크기에 따른 개수 저장 : HashMap
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<tangerine.length; i++){
            int x = 1;          // 빈도수 카운트 시작 = 1 (무조건 하나는 있으니까)
            if(map.containsKey(tangerine[i])){
                x = map.get(tangerine[i]) + 1;
            }
            map.put(tangerine[i], x);
        }
        //value 값 기준으로 내림차순 정렬 : List
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> map.get(o2) - map.get(o1));
        int answer = 0;         //key의 고유한 개수
        for(Integer key : list){
            k -= map.get(key);  //value값 빼기
            answer += 1;
            if(k <= 0){
                break;
            }
        }
        return answer;
    }
}