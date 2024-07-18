import java.util.*;
class Solution {
    public int solution(String before, String after) {
        String all = before + after;
        //HashMap으로 key,value 값 설정
        //value 값이 홀수이면 바로 0 return
        int answer = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char a : all.toCharArray()){
            if(map.containsKey(a)){         //중복이면 +1
                map.put(a, map.get(a)+1);
            }else{
                map.put(a, 1);              //중복 아니면 1
            }
        }
        for(char a : all.toCharArray()){
            if(map.get(a)%2==1){            
                return 0;               //value가 짝수이면 result 1
            }else{
                answer = 1;             //value가 홀수이면 result 0
            }
        }
        return answer;
    }
}