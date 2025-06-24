import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        //정수 → 문자열 : Integer.toString()
        //char → 문자열 : Character.toString()
        //문자열 → 정수 : Integer.parseInt()
        String str = Integer.toString(n);
        for(char s : str.toCharArray()){
            String ss = Character.toString(s);
            answer += Integer.parseInt(ss);
        }
        return answer;
    }
}