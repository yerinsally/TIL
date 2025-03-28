import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        //HashMap : key-value 쌍
        //의상종류 - 의상이름의 개수 쌍
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            String key = clothes[i][1];
            hm.put(key, hm.getOrDefault(key,0)+1);
        }
        //HashMap 길이만큼 순회
        //모든 value에 1을 더함(해당 의상 종류를 입지 않는 경우)
        //의상 종류별 선택 횟수를 구하기 위해 곱하기
        //모든 의상을 입지 않는 경우 제외
        int answer = 1;     //최소 한개의 의상은 입음
        for(String key : hm.keySet()){
            int num = hm.get(key)+1;
            answer *= num;
        }
        return answer-1;
    }
}