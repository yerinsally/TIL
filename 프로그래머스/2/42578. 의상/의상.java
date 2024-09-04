import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        //key = 의상의 종류(이름), value = 의상의 종류(개수)
        //해당 의상을 선택하지 않는 경우 포함하기!
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<clothes.length; i++){
            if(map.containsKey(clothes[i][1])){
                map.put(clothes[i][1], map.get(clothes[i][1])+1);
            }else{
                map.put(clothes[i][1], 1);
            }
        }
        System.out.println(map);
        int answer = 1;
        for(String key : map.keySet()){
            int number = map.get(key)+1;
            answer *= number;
        }
        return answer-1;
    }
}