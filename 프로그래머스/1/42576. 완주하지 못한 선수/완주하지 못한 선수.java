import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String p : participant){
            map.put(p, map.getOrDefault(p,0)+1);
        }
        for(String c : completion){
            map.put(c, map.get(c)-1);   //완료한 선수는 value-1
        }
        for(String m : participant){    //for문 : participant에 있는 선수들에 대해
            if(map.get(m)>0){
                answer = m;
            }
        }
        return answer;
    }
}