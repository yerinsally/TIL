import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        //s를 공백을 기준으로 단어를 자르고, 대소문자 변경하고,
        String[] str_split = s.split(" ", -1);
        for(int i=0; i<str_split.length; i++){
            if(!str_split[i].equals(" ")){      //공백이 아니라면
            char[] array = str_split[i].toCharArray();
            String word = "";
            for(int j=0; j<array.length; j++){
                if(j%2==0){
                    word += Character.toUpperCase(array[j]);
                }else{
                    word += Character.toLowerCase(array[j]);
                }
            }
            str_split[i] = word;
            }else{
                str_split[i] = " ";
            }
            //자른 단어 다음에 공백 추가
            if(str_split[i] != str_split[str_split.length-1]){
                answer += str_split[i]+" ";   
            }else{
                answer += str_split[i];
            }
        }
        return answer;
    }
}