import java.util.*;
class Solution {
    public String solution(String my_string) {
        //중복 문자열 제거하도록 HashSet 사용
        HashSet<Character> set = new HashSet<>();
        String answer = "";
        //문자열의 각 문자를 순회하면서 HashSet에 추가
        for (char c : my_string.toCharArray()) {
            if (set.add(c)) {       //HashSet에 추가가 성공 = 중복 X
                answer += c;        //결과 문자열에 추가
            }
        }
        return answer;
    }
}