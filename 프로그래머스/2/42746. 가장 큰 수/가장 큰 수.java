import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        //1. 숫자 -> 문자열 변환
        String[] str_arr = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            str_arr[i] = Integer.toString(numbers[i]);
        }
        
        //2. 정렬 (b+a이 a+b보다 크면 b가 앞에 와야 함)
        Arrays.sort(str_arr, (a,b) -> (b+a).compareTo(a+b));
        
        //3. 정렬된 문자열을 이어붙임
        String result ="";
        for (String str : str_arr) {
            result += str;
        }
        
        //4. 가장 큰 수가 0인 경우 예외 처리
        if (str_arr[0].equals("0")) {
            return "0";
        }
        return result;
    }
}