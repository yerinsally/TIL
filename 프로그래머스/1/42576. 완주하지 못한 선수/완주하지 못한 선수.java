import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        //HashMap : key-value 쌍
        HashMap<String, Integer> hm = new HashMap<>();
        for(String p : participant){
            hm.put(p, hm.getOrDefault(p,0)+1);
        }
        //HashMap 갱신 : 완주했으면 key의 value-1
        for(String c : completion){
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c)-1);
            }
        }
        //완주하지 못한 선수 = 1 이상의 값을 가지고 있음
        String answer = "";
        for(String key : hm.keySet()){
            if(hm.get(key)>0){
                answer = key;
            }
        }
        return answer;
    }
}