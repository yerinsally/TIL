import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        //중복이 허용되지 않는 배열 : set 자료구조
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<i; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        
         // Set -> 배열로 변환
        int[] answer = new int[set.size()]; //set 크기 = size()
        int index = 0;
        for (int num : set) {
            answer[index++] = num;          //set은 인덱싱 X
        }
        Arrays.sort(answer);    //정렬
        return answer;
    }
}