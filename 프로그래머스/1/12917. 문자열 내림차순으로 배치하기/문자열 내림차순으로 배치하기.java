import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] array = s.toCharArray();
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            answer += array[array.length-i-1];
        }
        return answer;
    }
}