import java.util.*;
class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int result = -1;
        for(int a : array){
            int freq = map.getOrDefault(a,0)+1;
            map.put(a, freq);
            
            if(freq > max){
                max = freq;
                result = a;
            }else if(freq == max){
                result = -1;
            }
        }
        //int max = Collections.max(map.values());
        return result;
    }
}