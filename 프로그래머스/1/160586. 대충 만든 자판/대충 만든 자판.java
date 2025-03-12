import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        //미리 배열 크기 정의
        int[] answer = new int[targets.length];
        //HashMap
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<keymap.length; i++){
            String[] str = keymap[i].split("");     //[A,B,A,C,D]
            for(int j=0; j<str.length; j++){
                if(map.isEmpty()){
                    map.put(str[j], j+1);
                }else if(map.containsKey(str[j])){  //key 겹치는 경우
                    //이미 있는 value 값과 비교해 더 작은 수로
                    if(j+1 < map.get(str[j])){
                        map.put(str[j], j+1);
                    }
                }else{
                    map.put(str[j], j+1);
                }
            }
        }
        //전체 map 출력
        map.forEach((key, value) -> {	
	        System.out.println(key + " : " + value);	
        });
        
        
        for(int i=0; i<targets.length; i++){
            //ans는 i 루프 안에서 0으로 초기화
            int ans = 0;
            String[] str2 = targets[i].split("");
            for(int j=0; j<str2.length; j++){
                //첫번째 문자부터 포함되지 않으면 바로 -1
                if(!map.containsKey(str2[j])){
                    answer[i] = -1;
                    break;
                }else{
                    ans += map.get(str2[j]);
                    answer[i] = ans;
                }
            }
        }
        return answer;
    }
}