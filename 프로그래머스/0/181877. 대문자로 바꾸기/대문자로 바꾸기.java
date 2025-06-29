import java.util.*;
class Solution {
    public String solution(String myString) {
        String answer = "";
        for(char str : myString.toCharArray()){
            answer += Character.toUpperCase(str);
        }
        return answer;
    }
}