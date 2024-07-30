import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        //시작 & 끝 인덱스 설정
        int start = 0;
        int end = people.length-1;
        //투 포인터 방식 사용
        while(start < end){
            if(people[start]+people[end] <= limit){
                start++;
                end--;
                answer++;
            }else{
                end--;
                answer++;
            }
        }
        if(start == end){
            answer++;
        }
        return answer;
    }
}