import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        //HashMap(Key, Value) 이용
        //중복일 경우 value+=1, 중복 아니면 value=1
        Map<String, Integer> map = new HashMap<String, Integer>();
        //participant, completion 선수
        for(String p : participant){
            if(map.containsKey(p)){     //중복된다면
                int count = map.get(p);
                map.put(p, count+1);
            }else{
                map.put(p, 1);          //중복 아니면
            }
        }
        for(String c : completion){
            if(map.containsKey(c)){     //중복된다면
                int count = map.get(c);
                map.put(c, count+1);
            }else{
                map.put(c, 1);          //중복 아니면
            }
        }
        //Iterator 이용해서 출력
        String answer = "";
        Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
            if(value%2 == 1){           //동명이인 : 홀수로 값을 가짐 
                answer = key;
            }
		}
        return answer;
    }
}