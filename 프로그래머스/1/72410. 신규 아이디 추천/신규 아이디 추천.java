import java.util.*;
class Solution {
    public String solution(String new_id) {
        //가능 = 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)
        char[] arr = new_id.toCharArray();
        StringBuilder sb = new StringBuilder();
        //1+2단계
        for(int i=0; i<arr.length; i++){
            char c = Character.toLowerCase(arr[i]);
            if (Character.isLowerCase(c) || Character.isDigit(c) || c == '-' || c == '_' || c == '.') {
                sb.append(c);
            }
        }
        // 3단계: 마침표 연속 제거
        String answer = sb.toString().replaceAll("[.]{2,}", ".");
        // 4단계: 처음이나 끝의 마침표 제거
        answer = answer.replaceAll("^[.]|[.]$", "");
        //5단계
        if(answer.equals("")){
            answer = "a";
        }
        //6단계
        if(answer.length() >= 16){
            answer = answer.substring(0,15);
            char c = answer.charAt(answer.length()-1);
            if(c=='.'){
                answer = answer.substring(0,14);
            }
        }
        //7단계
        if(answer.length() <= 2){
            while(answer.length()<3){
                answer += answer.charAt(answer.length()-1);
            }
        }
        return answer;
    }
}