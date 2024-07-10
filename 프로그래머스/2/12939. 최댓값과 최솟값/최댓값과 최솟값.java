import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        //문자열 공백 기준으로 나누기
        String[] array = s.split(" ");
        //정수 배열 선언 (길이 정의 필요)
        int[] int_array = new int[array.length];
        //정수 배열에 문자열 넣기 [1,2,3,4]
        for(int i=0; i<array.length; i++){
            int_array[i] = Integer.parseInt(array[i]);
        }
        //최대, 최소 추출
        Arrays.sort(int_array);
        int min=int_array[0];
        int max=int_array[0];
        for(int i=0; i<int_array.length; i++){
            for(int j=0; j<i; j++){
                if(int_array[i]<=int_array[j]){
                    min = int_array[i];
                }else if(int_array[i]>=int_array[j]){
                    max = int_array[i];
                }
            }
        }
        answer = min + " " + max;
        return answer;
    }
}