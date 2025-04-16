import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        //모든 단어의 첫 문자 대문자, 그 외 모두 소문자
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            if((i==0 || arr[i-1]==' ') && Character.isAlphabetic(arr[i])){
                sb.append(Character.toUpperCase(arr[i]));
            }else if(i==0 && Character.isDigit(arr[i])){
                sb.append(arr[i]);
            }else{
                sb.append(Character.toLowerCase(arr[i]));
            }
        }
        return sb.toString();
    }
}